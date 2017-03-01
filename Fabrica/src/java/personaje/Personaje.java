/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaje;

import armas.ArmaAbstracta;
import cuerpo.Cuerpo;
import escudo.EscudoAbstracto;
import montura.Montura;

/**
 *
 * @author Estudiantes
 */
public abstract class Personaje {
    
    protected Cuerpo miCuerpo;
    protected Montura miMontura;
    protected EscudoAbstracto miEscudo;
    protected ArmaAbstracta miArma;
    
    
    public abstract String toString();

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
