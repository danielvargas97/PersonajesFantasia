package constructores;

import fabricas.FabricaElfo;
import personaje.Elfo;
import personaje.Personaje;

/**
 *
 * @author VARGAS
 */
public class ConstructorElfo extends Constructor {
    
    public ConstructorElfo(){
        miFabrica = FabricaElfo.getFabricaElfos();
    }
    
    
    @Override
    public void crearBase() {
        personaje = new Elfo();
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
