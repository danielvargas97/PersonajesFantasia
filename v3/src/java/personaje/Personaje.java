package personaje;

import armas.ArmaAbstracta;
import cuerpo.Cuerpo;
import escudo.EscudoAbstracto;
import montura.Montura;

/**
 *
 * @author Estudiantes
 */
public abstract class Personaje implements Cloneable {
    
    protected Cuerpo miCuerpo;
    protected Montura miMontura;
    protected EscudoAbstracto miEscudo;
    protected ArmaAbstracta miArma;
    
    
    /**
     * Da una pequeña descripcion del Personaje
     * @return tipo del Personaje
     */
    @Override
    public abstract String toString();
    
    /**
     * Realiza una copia de un personaje
     * @return copia del Personaje
     */
    public abstract Personaje clonarPersonaje();
    
    
    public Cuerpo getMiCuerpo() {
        return miCuerpo;
    }

    public void setMiCuerpo(Cuerpo miCuerpo) {
        this.miCuerpo = miCuerpo;
    }

    public Montura getMiMontura() {
        return miMontura;
    }

    public void setMiMontura(Montura miMontura) {
        this.miMontura = miMontura;
    }

    public EscudoAbstracto getMiEscudo() {
        return miEscudo;
    }

    public void setMiEscudo(EscudoAbstracto miEscudo) {
        this.miEscudo = miEscudo;
    }

    public ArmaAbstracta getMiArma() {
        return miArma;
    }

    public void setMiArma(ArmaAbstracta miArma) {
        this.miArma = miArma;
    }
    
    
    
    
}
