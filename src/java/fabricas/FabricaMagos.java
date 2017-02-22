/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import armas.ArmaAbstracta;
import armas.Baston;
import cuerpo.Cuerpo;
import cuerpo.CuerpoMago;
import escudo.AmuletoMago;
import escudo.EscudoAbstracto;
import montura.Capa;
import montura.Montura;

/**
 *
 * @author VARGAS
 */
public class FabricaMagos extends FabricaAbstracta {

    @Override
    public ArmaAbstracta crearArma() {
        return new Baston();
    }

    @Override
    public EscudoAbstracto crearEscudo() {
       return new AmuletoMago();
    }

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoMago();
    }

    @Override
    public Montura crearMontura() {
        return new Capa();
    }
    
    
}
