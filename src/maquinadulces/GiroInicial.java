/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadulces;

/**
 *
 * @author Geek
 */
public class GiroInicial implements Estado{

    @Override
    public void cambioEstado(MaquinaDelMal m) {
        if (m.getMoneda()!=false) {
            m.setEstado(2);
        }
        else{
            m.setEstado(0);
        }
        System.out.println("GIRO");
    }

    
    
}
