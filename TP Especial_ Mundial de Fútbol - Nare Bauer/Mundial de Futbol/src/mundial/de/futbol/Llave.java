package mundial.de.futbol;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Nareyii
 */
public abstract class Llave extends EtapaMundial {
    
    @Override
    //Metodo para retornar una lista de los equipos que avanzan
    public List<Equipo> getEquiposQueAvanzan(){
        //Creamos una lista nueva para cargar los equipos que avanzan
        List<Equipo> equipos = new ArrayList<>();
        //Recorremos la lista de partidos de la etapa mundial
        for (Partido partidito : getPartidos()){
            /*Si en el partido que estamos parados gano el local, agregamos ese equipo
            local a la lista de equipos*/
            if (partidito.getResultado().ganoLocal()){
                equipos.add(partidito.getLocal());
            }
            /*Si NO gano el local, agregamos el equipo visitante a la lista de equipos*/
            if (!partidito.getResultado().ganoLocal()){
                equipos.add(partidito.getVisitante());
            }
        }
        //Retornamos la nueva lista con los equipos que avanzan
        return equipos;
    }
    
}
