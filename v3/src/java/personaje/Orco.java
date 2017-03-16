/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaje;

/**
 *
 * @author Estudiantes
 */
public class Orco extends Personaje {

    @Override
    public String toString() {
        return "orco";
    }
    
    
    @Override
    public Personaje clonarPersonaje(){
        Personaje clon = null;
        try{
            clon = (Orco)super.clone();
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
