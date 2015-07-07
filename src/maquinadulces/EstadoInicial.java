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
public class EstadoInicial implements Estado{

    @Override
    public void cambioEstado(MaquinaDelMal m) {
        m.setEstado(1);
        System.out.println("INICIAL");
        
    }
}
