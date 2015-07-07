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
public class MaquinaDulces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EstadoInicial es = new EstadoInicial();
        GiroInicial gi = new GiroInicial();
        DarDulce dr = new DarDulce();
        ArrayList<Estado> l = new ArrayList<>();
        l.add(es);
        l.add(gi);
        l.add(dr);
        MaquinaDelMal m = new MaquinaDelMal(l);
        
        m.procesar();
        m.procesar();
        m.procesar();
        m.setMoneda(true);
        m.procesar();
        m.procesar();
        m.procesar();
        
        
        
        
        
        
        
        
    }
    
}
