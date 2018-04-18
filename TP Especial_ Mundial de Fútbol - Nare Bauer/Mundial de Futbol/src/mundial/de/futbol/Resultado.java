package mundial.de.futbol;

/**
 *
 * @author Nareyii
 */
public class Resultado {
    //Atributos
    private int golesLocal;
    private int golesVisitante;
    
    //Getters de los goles
    public int getGolesLocal(){
        return this.golesLocal;
    }
    public int getGolesVisitante(){
        return this.golesVisitante;
    }
    
    //Boolean para saber quién gano
    public boolean ganoLocal(){
        if (golesLocal > golesVisitante)
            return true;
        return false;
    }
    //Boolean para saber si empataron
    public boolean empate(){
        if (golesLocal == golesVisitante)
            return true;
        return false;
    }
    
}
