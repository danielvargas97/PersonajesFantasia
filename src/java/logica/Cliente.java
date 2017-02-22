/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import fabricas.FabricaAbstracta;

/**
 *
 * @author Invitado
 */
public class Cliente {
    /*
    private FabricaAbstracta fabAbs;
    private EscudoAbstracto escAbs;
    private ArmaAbstracta armAbs;*/
    
    public Cliente() {
    }
    
    /*
    Metodo que recibe el personaje seleccionado a traves del servlet
    y lo envia a la fabrica abstracta dando su resultado
    */
    public FabricaAbstracta getFabricaAbs(String tipo){
        FabricaAbstracta fabAbs = FabricaAbstracta.getPersonaje(tipo);
        return fabAbs;
    }

}
