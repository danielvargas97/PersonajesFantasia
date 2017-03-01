
import armas.ArmaAbstracta;
import cuerpo.Cuerpo;
import escudo.EscudoAbstracto;
import fabricas.FabricaAbstracta;
import fabricas.FabricaMagos;
import fabricas.FabricaOrcos;
import montura.Montura;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VARGAS
 */
public class Test {
    public static void main(String args[]){
        FabricaAbstracta fabs = FabricaMagos.getFabricaMagos();
        
        Cuerpo body = fabs.crearCuerpo();
        System.out.println(body.toString());
        
        Montura mont = fabs.crearMontura();
        
        System.out.println(mont.toString());
        
        EscudoAbstracto esabs = fabs.crearEscudo();
        System.out.println(esabs.toString());
        
        ArmaAbstracta armaAbs = fabs.crearArma();
        System.out.println(armaAbs.toString());

        
    }
}
