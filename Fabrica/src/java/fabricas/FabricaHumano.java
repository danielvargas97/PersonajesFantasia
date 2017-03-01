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
 *Fabrica de los humanos
 * @author Invitado
 */
public class FabricaHumano extends FabricaAbstracta {
    
    private static FabricaHumano fabricaDeHumanos;
    
    private FabricaHumano(){}
    
    /**
     * Metodo para crear fabrica mediante Singleton
     * @return Fabrica de Humanos
     */
    public static FabricaHumano getFabricaHumanos(){
        if(fabricaDeHumanos == null){
            fabricaDeHumanos = new FabricaHumano();
        }
        return fabricaDeHumanos;
    }
    
    
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
    /*
    Metodo que asigna el cuerpo humano al humano
    */
    public Cuerpo crearCuerpo() {
        return new CuerpoHumano();
    }

    @Override
    /*
    Metodo que asigna la armadura al humano
    */
    public Montura crearMontura() {
        return new ArmaduraHumana();
    }

}
