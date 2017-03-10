package logica;

import armas.ArmaAbstracta;
import constructores.Constructor;
import constructores.ConstructorElfo;
import constructores.ConstructorEnano;
import constructores.ConstructorHumano;
import constructores.ConstructorMago;
import constructores.ConstructorOrco;
import constructores.Director;
import cuerpo.Cuerpo;
import escudo.EscudoAbstracto;
import fabricas.FabricaAbstracta;
import fabricas.FabricaElfo;
import fabricas.FabricaEnanos;
import fabricas.FabricaHumano;
import montura.Montura;
import fabricas.FabricaMagos;
import fabricas.FabricaOrcos;
import personaje.Personaje;

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
    private Director dic;
    private Constructor cons;
    
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
    
    public void seleccionarConstructor(String tipo){
        if(tipo.equalsIgnoreCase("Humano")){
            cons= new ConstructorHumano();   
        }else if(tipo.equalsIgnoreCase("Elfo")){
            cons= new ConstructorElfo();   
        }else if(tipo.equalsIgnoreCase("Enano")){
            cons= new ConstructorEnano();   
        }else if(tipo.equalsIgnoreCase("Mago")){
            cons= new ConstructorMago();   
        }else if(tipo.equalsIgnoreCase("Orco")){
            cons= new ConstructorOrco();   
        }
    }
    
    public Personaje crear(Constructor constructor){
        dic = new Director(constructor);
        dic.construirPersonaje();
        return dic.getPersonaje();
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

    public Constructor getConstructor() {
        return cons;
    }
  

}
