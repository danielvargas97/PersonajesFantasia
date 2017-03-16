package personaje;

/**
 *
 * @author Estudiantes
 */
public class Elfo extends Personaje {

    @Override
    public String toString() {
        return "elfo";
    }

    @Override
    public Personaje clonarPersonaje(){
        Personaje clon = null;
        try{
            
            clon = (Elfo)super.clone();// Clona el elfo sin sus partes
            
            //Empieza a asignar las partes al elfo
            
            clon.setMiArma(miArma);
            clon.setMiEscudo(miEscudo);
            clon.setMiCuerpo(miCuerpo);
            clon.setMiMontura(miMontura);
            
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        
        return clon;
    }

}
