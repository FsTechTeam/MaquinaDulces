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
public class DarDulce implements Estado{

    @Override
    public void cambioEstado(MaquinaDelMal m) {
         m.setEstado(0);
         m.setMoneda(false);
        System.out.println("DAR DULCE");
    }
    
}
