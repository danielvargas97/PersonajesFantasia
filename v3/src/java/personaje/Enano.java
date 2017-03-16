package personaje;

/**
 *
 * @author Estudiantes
 */
public class Enano extends Personaje {
    
    @Override
    public String toString() {
        return "Enano";
    }

    @Override
    public Personaje clonarPersonaje() {
        Personaje clon = null;
        try {
            clon = (Enano) super.clone();// Realiza una copia del Enano (Sin partes)
            
            //Asigna las partes del Enano
            
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
