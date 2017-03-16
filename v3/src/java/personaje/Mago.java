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
public class Mago extends Personaje {

    @Override
    public String toString() {
        return "Mago";
    }
    
    @Override
    public Personaje clonarPersonaje(){
        Personaje clon = null;
        try{
            clon = (Mago)super.clone();//Crea un Mago sin sus partes
            
            //Asignamos las partes del Mago
            
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
