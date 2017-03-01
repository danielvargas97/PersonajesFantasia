package constructores;

import armas.ArmaAbstracta;
import cuerpo.Cuerpo;
import escudo.EscudoAbstracto;
import fabricas.FabricaAbstracta;
import montura.Montura;

/**
 *
 * @author Estudiantes
 */
public abstract class Constructor {
    
    public abstract void crearBase(Personaje miPersonaje);
    public abstract void construirEscudo(EscudoAbstracto escudo);
    public abstract void construirMontura(Montura montura);
    public abstract void construirArma(ArmaAbstracta arma);
    public abstract void construirCuerpo(Cuerpo cuerpo);
    
    public abstract Personaje crearPersonaje();
}
