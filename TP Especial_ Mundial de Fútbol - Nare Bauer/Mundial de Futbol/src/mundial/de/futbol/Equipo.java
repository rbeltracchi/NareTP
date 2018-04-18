package mundial.de.futbol;
    
import java.util.List;

/**
 * @author Nareyii
 */
public class Equipo {
    //Atributos
    private String nombre;
    private List<Partido> partidosJugados;
    
    //Setters y getters
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public List<Partido> getPartidosJugados(){
        return this.partidosJugados;
    }
    
    //Método para obtener la diferencia de goles de los partidos
    public int getDiferenciaDeGoles(){
        //Variables internas necesarias para el cálculo del método
        int diferencia = 0;
        int golesRecibidos = 0;
        int golesConvertidos = 0;
        //Recorremos los partidos del equipo
        for (Partido partidito : this.partidosJugados){
            /*Si este equipo es el local, sumo los goles locales a los convertidos,
            y los goles visitantes a los recibidos*/
            if (this.equals(partidito.getLocal())){
                golesConvertidos += (partidito.getResultado().getGolesLocal());
                golesRecibidos += (partidito.getResultado().getGolesVisitante());
            }
            /*Si este equipo es el visitante, sumo los goles visitantes a los convertidos,
            y los goles locales a los recibidos*/
            if (this.equals(partidito.getVisitante())){
                golesConvertidos += (partidito.getResultado().getGolesVisitante());
                golesRecibidos += (partidito.getResultado().getGolesLocal());
            }
        }
        /*Si los goles convertidos con mayores que los recibidos, retorno la diferencia de 
        los goles, sino, retorno 0*/
        if (golesConvertidos > golesRecibidos){
            diferencia += (golesConvertidos - golesRecibidos);
        }else{
            diferencia = 0;
        }
        //Retornamos la diferencia
        return diferencia;
    }
    
    //Metodo para calcular los puntos de mi equipo
    public int getPuntos (){
        int puntos = 0;
        //Recorremos la lista de los partidos del equipito
        for (Partido partidos : this.getPartidosJugados()) {
            //Si gano el local, y mi equipito es el local, le sumo 3 pts a mi equipito
            if (partidos.getResultado().ganoLocal() && this.equals(partidos.getLocal())){
                puntos += 3;
            }
            //Si NO gano el local, y mi equipito es el visitante, le sumo 3 pts a mi equipito
            if (!partidos.getResultado().ganoLocal() && this.equals(partidos.getVisitante())){
                puntos += 3;
            }
            //Si el partido de mi equipito termino empatado, se sumo un pnt a mi equipito
            if (partidos.getResultado().empate()){
                puntos += 1;
            }
        }
        //Retornamos los puntos del equipo
        return puntos;
    }
}
