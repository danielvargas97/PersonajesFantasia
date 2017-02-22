/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import armas.ArmaAbstracta;
import cuerpo.Cuerpo;
import escudo.EscudoAbstracto;
import montura.Montura;

/**
 *
 * @author Invitado
 */
public abstract class FabricaAbstracta {
    
    public abstract ArmaAbstracta crearArma();
    public abstract EscudoAbstracto crearEscudo();
    public abstract Cuerpo crearCuerpo();
    public abstract Montura crearMontura();
    
    /*
    Metodo que recibe del cliente el tipo de personaje seleccionado
    y lo fabrica
    */
    public static FabricaAbstracta getPersonaje(String tipo){
        if(tipo.equalsIgnoreCase("humano")){
            return new FabricaHumano();
        }else if(tipo.equalsIgnoreCase("elfo")){
            return new FabricaElfo();
        }
        return new FabricaHumano();
    }
    
    
}
