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
 *Fabrica de Magos
 * @author VARGAS
 */
public class FabricaMagos extends FabricaAbstracta {

    private static FabricaMagos fabricaDeMagos;
    
    private FabricaMagos(){
    }
    
    /**
     * Metodo para crear fabrica mediante Singleton
     */
    public static FabricaMagos getFabricaMagos(){
        if(fabricaDeMagos == null){
            fabricaDeMagos = new FabricaMagos();
        }
        return fabricaDeMagos;
    }
    
    @Override
    /*
    Metodo que devuelve el baston como arma del mago
    */
    public ArmaAbstracta crearArma() {
        return new Baston();
    }
    

    @Override
    /*
    Metodo que devuelve el amuleto como escudo del mago
    */
    public EscudoAbstracto crearEscudo() {
       return new AmuletoMago();
    }

    @Override
    /*
    Metodo que devuelve el cuerpo del mago
    */
    
    public Cuerpo crearCuerpo() {
        return new CuerpoMago();
    }

    @Override
    /*
    Metodo que devuelve la capa como montura del mago
    */
    public Montura crearMontura() {
        return new Capa();
    }
    
    
}
