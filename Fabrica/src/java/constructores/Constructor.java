package constructores;

import armas.ArmaAbstracta;
import cuerpo.Cuerpo;
import escudo.EscudoAbstracto;
import fabricas.FabricaAbstracta;
import montura.Montura;
import personaje.Personaje;

/**
 *
 * @author Estudiantes
 */
public abstract class Constructor {
    protected Personaje personaje;
    protected FabricaAbstracta miFabrica;
    
    
    
    public abstract void crearBase();
    public abstract void construirEscudo();
    public abstract void construirMontura();
    public abstract void construirArma();
    public abstract void construirCuerpo();
    public abstract Personaje crearPersonaje();
    
}
