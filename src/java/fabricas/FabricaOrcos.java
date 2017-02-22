/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import armas.ArmaAbstracta;
import armas.Mazo;
import cuerpo.Cuerpo;
import cuerpo.CuerpoOrco;
import escudo.EscudoAbstracto;
import escudo.EscudoOrco;
import montura.HarapoOrco;
import montura.Montura;

/**
 *
 * @author VARGAS
 */
public class FabricaOrcos extends FabricaAbstracta {

    @Override
    public ArmaAbstracta crearArma() {
        return new Mazo();
    }

    @Override
    public EscudoAbstracto crearEscudo() {
        return new EscudoOrco();
    }

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoOrco();
    }

    @Override
    public Montura crearMontura() {
        return new HarapoOrco();
    }
    
}
