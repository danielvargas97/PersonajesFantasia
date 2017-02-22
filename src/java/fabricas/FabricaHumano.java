/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import armas.ArmaAbstracta;
import escudo.EscudoAbstracto;
import escudo.EscudoRomano;
import armas.Espada;
import cuerpo.Cuerpo;
import cuerpo.CuerpoElfo;
import cuerpo.CuerpoHumano;
import montura.ArmaduraHumana;
import montura.Montura;

/**
 *
 * @author Invitado
 */
public class FabricaHumano extends FabricaAbstracta {
    
    @Override
    /*
    Metodo que asigna el arma espada al humano
    */
    public ArmaAbstracta crearArma() {
        return new Espada();
    }

    @Override
    /*
    Metodo que asiga el escudo romando al humano
    */
    public EscudoAbstracto crearEscudo() {
        return new EscudoRomano();
    }

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoHumano();
    }

    @Override
    public Montura crearMontura() {
        return new ArmaduraHumana();
    }

}
