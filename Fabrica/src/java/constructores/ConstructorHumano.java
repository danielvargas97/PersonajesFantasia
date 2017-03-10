package constructores;

import fabricas.FabricaHumano;
import personaje.Humano;
import personaje.Personaje;

/**
 *
 * @author VARGAS
 */
public class ConstructorHumano extends Constructor {
    
    
    public ConstructorHumano(){
        miFabrica = FabricaHumano.getFabricaHumanos();
    }
    
    @Override
    public void crearBase() {
        personaje = new Humano();
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
