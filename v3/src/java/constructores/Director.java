package constructores;

import personaje.Personaje;

/**
 * Clase Director del Builder
 * @author Estudiantes
 */
public class Director {
    private Constructor miConstructor;
    
    
    public Director(){};
    
    public Director(Constructor constructor){
        miConstructor = constructor;
    }
    
    /**
     * Construye el personaje
     */
    public void construirPersonaje(){
        miConstructor.crearBase();
        miConstructor.construirCuerpo();
        miConstructor.construirArma();
        miConstructor.construirEscudo();
        miConstructor.construirMontura();
    }
    
    public Personaje getPersonaje(){
        return miConstructor.crearPersonaje();
    }
    
    public void setMiConstructor(Constructor constr){
        miConstructor = constr;
    }

}
