/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadulces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Geek
 */
public class MaquinaDelMal {
    private int estado;
    private boolean moneda;
    ArrayList<Estado> estados;
    
    
    public void procesar(){
        this.estados.get(estado).cambioEstado(this);
    
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public boolean getMoneda(){
        return this.moneda;
    }

    public void setMoneda(boolean moneda) {
        this.moneda = moneda;
    }
    
    public MaquinaDelMal(ArrayList<Estado> estado){
        this.estados = estado;
        this.estado=0;
        this.moneda=false;
    }
    
    

    
    

    
    
    
    
    
}
