package mundial.de.futbol;

import java.util.Date;
import java.util.List;

/**
 * @author Nareyii
 */
public abstract class EtapaMundial {
    //Atributos
    private String descripcionEtapa;
    private List<Partido> partidos;
    
    //Constructores de Etapa Mundial
    public EtapaMundial(){
        
    }
    public EtapaMundial(List<Partido> partidos){
        this.partidos = partidos;
    }
    public EtapaMundial(List<Partido> partidos, String descripcionEtapa){
        this.partidos = partidos;
        this.descripcionEtapa = descripcionEtapa;
    }
    
    //Getters
    public String getDescripcionEtapa(){
        return this.descripcionEtapa;
    }
    protected List<Partido> getPartidos(){
        return this.partidos;
    }
    
    //Metodo para agregar un partido a la lista de partidos
    public void addPartido(Partido Partido){
        this.partidos.add(Partido);
    }
    
    //Metodo abstracto para obtener una lista con los equipos que avanzan
    public abstract List<Equipo> getEquiposQueAvanzan();
    
}
