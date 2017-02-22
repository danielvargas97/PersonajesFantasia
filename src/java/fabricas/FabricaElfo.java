/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import armas.ArmaAbstracta;
import escudo.EscudoAbstracto;
import escudo.EscudoPlateado;
import armas.Hacha;
import cuerpo.Cuerpo;
import cuerpo.CuerpoElfo;
import montura.Montura;
import montura.UniformeElfo;

/**
 *
 * @author Invitado
 */
public class FabricaElfo extends FabricaAbstracta{

    @Override
    /*
    Metodo que asiga el arma hacha al elfo
    */
    public ArmaAbstracta crearArma() {
        return new Hacha();
    }

    @Override
    /*
    Metodo que asiga el escudo plateado al elfo
    */
    public EscudoAbstracto crearEscudo() {
        return new EscudoPlateado();
    }

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoElfo();
    }

    @Override
    public Montura crearMontura() {
        return new UniformeElfo();
    }

}
