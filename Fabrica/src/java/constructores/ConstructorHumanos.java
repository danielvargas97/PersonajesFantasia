/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

import armas.ArmaAbstracta;
import cuerpo.Cuerpo;
import escudo.EscudoAbstracto;
import fabricas.FabricaAbstracta;
import fabricas.FabricaHumano;
import montura.Montura;
import personaje.Humano;
import personaje.Personaje;

/**
 *
 * @author Estudiantes
 */
public class ConstructorHumanos extends Constructor {
    
    private Personaje miHumano;
    
    public ConstructorHumanos(){
        miFabrica = FabricaHumano.getFabricaHumanos();
        miHumano = new Humano();
        
    }
    
    
    @Override
    public void construirEscudo(EscudoAbstracto escudo) {
        miHumano.setMiEscudo(miFabrica.crearEscudo());
    }

    @Override
    public void construirMontura(Montura montura) {
        miHumano.setMiMontura(miFabrica.crearMontura());
    }

    @Override
    public void construirArma(ArmaAbstracta arma) {
        miHumano.setMiArma(miFabrica.crearArma());
    }

    @Override
    public void construirCuerpo(Cuerpo cuerpo) {
        miHumano.setMiCuerpo(miFabrica.crearCuerpo());
    }
    
    public Personaje crearPersonaje(){
        return miHumano;
    }
    
}