package constructores;

import fabricas.FabricaMagos;
import personaje.Mago;
import personaje.Personaje;

/**
 *
 * @author VARGAS
 */
public class ConstructorMago extends Constructor {
    
    public ConstructorMago(){
        miFabrica = FabricaMagos.getFabricaMagos();
    }

    @Override
    public void crearBase() {
        personaje = new Mago();
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
