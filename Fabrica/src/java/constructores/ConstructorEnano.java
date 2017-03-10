package constructores;

import fabricas.FabricaEnanos;
import personaje.Enano;
import personaje.Personaje;

/**
 *
 * @author VARGAS
 */
public class ConstructorEnano extends Constructor {
    
    
    public ConstructorEnano(){
        miFabrica = FabricaEnanos.getFabricaEnanos();
    }
    
    @Override
    public void crearBase() {
        personaje = new Enano();
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
