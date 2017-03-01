package logica;

import armas.ArmaAbstracta;
import cuerpo.Cuerpo;
import escudo.EscudoAbstracto;
import fabricas.FabricaAbstracta;
import fabricas.FabricaElfo;
import fabricas.FabricaEnanos;
import fabricas.FabricaHumano;
import montura.Montura;
import fabricas.FabricaMagos;
import fabricas.FabricaOrcos;

/**
 *
 * @author Invitado
 */
public class Cliente {
    
    private FabricaAbstracta fabAbs;
    private EscudoAbstracto escAbs;
    private ArmaAbstracta armAbs;
    private Cuerpo cuerpoAbs;
    private Montura monturaAbs;
    
    public Cliente() {
    }
    
    /*
    Metodo que crea el personaje segun la elección hecha en html y 
    gestionada por el servlet
    */
    public void personaje(String tipo){
        if(tipo.equalsIgnoreCase("Humano")){
            fabAbs = FabricaHumano.getFabricaHumanos();
        }else if(tipo.equalsIgnoreCase("Elfo")){
            fabAbs = FabricaElfo.getFabricaElfos();
        }else if(tipo.equalsIgnoreCase("Enano")){
            fabAbs = FabricaEnanos.getFabricaEnanos();
        }else if(tipo.equalsIgnoreCase("Mago")){
            fabAbs = FabricaMagos.getFabricaMagos();
        }else if(tipo.equalsIgnoreCase("Orco")){
            fabAbs = FabricaOrcos.getFabricaOrcos();
        }
    }
    
    /*
    Metodo que crea el arma dependiendo del personaje elegido anteriormente
    y retorna un string con la url de la imagen
    */
    public String arma(){
        armAbs=fabAbs.crearArma();
        return armAbs.imagen();
    }
    
    /*
    Metodo que crea el cuerpo dependiendo del personaje elegido anteriormente
    y retorna un string con la url de la imagen
    */
    public String cuerpo(){
        cuerpoAbs=fabAbs.crearCuerpo();
        return cuerpoAbs.imagen();
    }
    
    /*
    Metodo que crea el escudo dependiendo del personaje elegido y retorna
    un string con la url de la imagen
    */
    public String escudo(){
        escAbs = fabAbs.crearEscudo();
        return escAbs.imagen();
    }
    
    /*
    Metodo que crea la montura dependiendo del personaje elegido y retorna
    un string con la url de la imagen
    */
    public String montura(){
        monturaAbs = fabAbs.crearMontura();
        return monturaAbs.imagen();
    }
  

}
