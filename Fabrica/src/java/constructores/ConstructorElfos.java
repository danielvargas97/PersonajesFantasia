package constructores;

import armas.ArmaAbstracta;
import cuerpo.Cuerpo;
import escudo.EscudoAbstracto;
import fabricas.FabricaAbstracta;
import fabricas.FabricaElfo;
import montura.Montura;
import personaje.Elfo;
import personaje.Personaje;

/**
 *
 * @author Estudiantes
 */
public class ConstructorElfos extends Constructor {
    private Personaje miElfo;
    private FabricaAbstracta miFabrica;
    
    public ConstructorElfos(){
        FabricaAbstracta miFabrica = FabricaElfo.getFabricaElfos();
        miElfo = new Elfo();
    }
    
    @Override
    public void construirEscudo(EscudoAbstracto escudo) {
       miElfo.setMiEscudo(miFabrica.crearEscudo());
    }

    @Override
    public void construirMontura(Montura montura) {
        miElfo.setMiMontura(miFabrica.crearMontura());
    }

    @Override
    public void construirArma(ArmaAbstracta arma) {
        miElfo.setMiArma(miFabrica.crearArma());
    }

    @Override
    public void construirCuerpo(Cuerpo cuerpo) {
        miElfo.setMiCuerpo(miFabrica.crearCuerpo());
    }
    
    public Personaje crearPersonaje(){
        return miElfo;
    }
    
}
