package personaje;

/**
 *
 * @author Estudiantes
 */
public class Humano extends Personaje {

    @Override
    public String toString() {
        return "Humano";
    }

    @Override
    public Personaje clonarPersonaje() {
        Personaje clon = null;
        try {
            clon = (Humano) super.clone();//Clona un Humano sin sus partes
            
            //Empezamos a asignar las partes al Humano
            
            clon.setMiArma(miArma);
            clon.setMiEscudo(miEscudo);
            clon.setMiCuerpo(miCuerpo);
            clon.setMiMontura(miMontura);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clon;
    }
    
}
