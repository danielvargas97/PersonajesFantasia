package constructores;

import fabricas.FabricaOrcos;
import personaje.Orco;
import personaje.Personaje;

/**
 *
 * @author VARGAS
 */
public class ConstructorOrco extends Constructor {
    
            
   public ConstructorOrco(){
       miFabrica = FabricaOrcos.getFabricaOrcos();
   }

    @Override
    public void crearBase() {
        personaje = new Orco();
    }

    @Override
    public void construirEscudo() {
        personaje.setMiEscudo(miFabrica.crearEscudo());
    }

    @Override
    public void construirMontura() {
        personaje.setMiMontura(miFabrica.crearMontura());
    }

    @Override
    public void construirArma() {
        personaje.setMiArma(miFabrica.crearArma());
    }

    @Override
    public void construirCuerpo() {
        personaje.setMiCuerpo(miFabrica.crearCuerpo());
    }
    
   @Override
    public Personaje crearPersonaje(){
        return personaje;
    }
}
