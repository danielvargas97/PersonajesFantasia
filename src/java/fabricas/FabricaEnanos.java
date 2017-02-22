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
 *
 * @author VARGAS
 */
public class FabricaEnanos extends FabricaAbstracta {

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
