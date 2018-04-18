package mundial.de.futbol;
import java.util.Date;
import java.util.List;
/**
 * @author Nareyii
 */
public class MundialDeFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo e inicializo los equipos
        Equipo e1 = new Equipo();
        e1.setNombre("River Plate");
        Equipo e2 = new Equipo();
        e2.setNombre("Boca Junios");
        Equipo e3 = new Equipo();
        e3.setNombre("Gimnasia");
        Equipo e4 = new Equipo();
        e4.setNombre("San Lorenzo");
        //Creo los partidos
        Partido superClasico = new Partido(new Date(),e1,e2);
        Partido unPartido = new Partido(new Date(),e3,e4);
        //Los agrego a la lista de partidos de la Etapa Mundial
        List<Partido> partidos = new List<Partido>(superClasico, unPartido);
        
        
        
        
        
        
    }
    
}
