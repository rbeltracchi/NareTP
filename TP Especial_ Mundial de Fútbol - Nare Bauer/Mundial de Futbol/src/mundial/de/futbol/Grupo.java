package mundial.de.futbol;
import java.util.List;
import java.util.ArrayList;
/**
 * @author Nareyii
 */
public class Grupo extends EtapaMundial {
    
    @Override
    public List<Equipo> getEquiposQueAvanzan(){
        //Creamos la nueva lista para los equipos que avanzan
        List<Equipo> equipos = new ArrayList<>();
        //Recorro los partidos de la etapa mundial
        for (Partido partidito : super.getPartidos()){
            /*Si en el partido en el que estamos parados los puntos del local son mayores que los puntos
            del visitante, agregamos el local a la lista de equipos*/
            if ((partidito.getLocal().getPuntos()) > (partidito.getVisitante().getPuntos())){
                equipos.add(partidito.getLocal());
            }
            /*Si en este partido los puntos del local son menores que los puntos del visitante, agregamos 
            el visitante a la lista de equipos*/
            if ((partidito.getLocal().getPuntos()) < (partidito.getVisitante().getPuntos())){
                equipos.add(partidito.getVisitante());
            }
        }
        //Retornamos la lista de equipos
        return equipos;
    }
}
