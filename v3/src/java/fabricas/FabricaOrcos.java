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
    private static FabricaOrcos fabricaDeOrcos;
    
    private FabricaOrcos(){}
    
    public static FabricaOrcos getFabricaOrcos(){
        if(fabricaDeOrcos==null){
            fabricaDeOrcos = new FabricaOrcos();
        }
        return fabricaDeOrcos;
    }
    
    
    @Override
    /*
    Crea un mazo como arma del orco
    */
    public ArmaAbstracta crearArma() {
        return new Mazo();
    }

    @Override
    /*
    Crea un escudo de orco
    */
    public EscudoAbstracto crearEscudo() {
        return new EscudoOrco();
    }

    @Override
    /*
    Crea el cuerpo del orco
    */
    public Cuerpo crearCuerpo() {
        return new CuerpoOrco();
    }

    @Override
    /*
    Crea un traje de batalla para el orco como montura
    */
    public Montura crearMontura() {
        return new HarapoOrco();
    }
    
}
