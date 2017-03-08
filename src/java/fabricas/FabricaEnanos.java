package fabricas;

import armas.ArmaAbstracta;
import armas.Martillo;
import cuerpo.Cuerpo;
import cuerpo.CuerpoEnano;
import escudo.EscudoAbstracto;
import escudo.EscudoRoble;
import montura.CamisaEnano;
import montura.Montura;

/**
 *Clase fábrica de los Enanos
 * @author VARGAS
 */
public class FabricaEnanos extends FabricaAbstracta {
    private static FabricaEnanos fabricaDeEnanos;
    
    private FabricaEnanos(){}
    
    /**
     * Metodo para crear fabrica concreta mediante Singleton
     */
    public static FabricaEnanos getFabricaEnanos(){
        if(fabricaDeEnanos == null){
            fabricaDeEnanos = new FabricaEnanos();
        }
        return fabricaDeEnanos;
    }
    
    
    @Override
    public ArmaAbstracta crearArma() {
        return new Martillo();                
    }

    @Override
    public EscudoAbstracto crearEscudo() {
        return new EscudoRoble();
    }

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoEnano();
    }

    @Override
    public Montura crearMontura() {
        return new CamisaEnano();
    }
    
}
