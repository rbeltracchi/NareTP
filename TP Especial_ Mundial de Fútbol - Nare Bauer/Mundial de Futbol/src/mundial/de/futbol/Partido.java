package mundial.de.futbol;
import java.util.Date;
/**
 *
 * @author Nareyii
 */
public class Partido {
    //Atributos
    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;
    
    //Constructor de Partido
    public Partido(Date fecha, Equipo local, Equipo visitante){
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
    }
    
    //Getters
    public Resultado getResultado(){
        return this.resultado;
    }
    public Equipo getLocal(){
        return this.local;
    }
    public Equipo getVisitante(){
        return this.visitante;
    }
    
}
