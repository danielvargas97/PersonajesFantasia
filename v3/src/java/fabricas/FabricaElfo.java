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
 *Fabrica de Elfos
 * @author Invitado
 */
public class FabricaElfo extends FabricaAbstracta{
    private static FabricaElfo fabricaDeElfos;
    
    private FabricaElfo(){}
    
    public static FabricaElfo getFabricaElfos(){
        if(fabricaDeElfos==null){
            fabricaDeElfos = new FabricaElfo();
        }
        return fabricaDeElfos;
    }
    
    
    
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
    /*
    Metodo que asigna el cuerpo de elfo al elfo
    */
    public Cuerpo crearCuerpo() {
        return new CuerpoElfo();
    }

    @Override
    /*
    Metodo que asigna el uniforme de elfo como montura
    */
    public Montura crearMontura() {
        return new UniformeElfo();
    }

}
