/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaherencia;

import helpers.Ingles;
import helpers.IntroduccionIngenieria;

/**
 *
 * @author arnoldgutierrez
 */
public class PracticaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ingles ingles = new Ingles();
        IntroduccionIngenieria introduccion = new IntroduccionIngenieria();
        
       
       
        System.out.println(ingles.obtenerInformacionAsignatura());
       ingles.imprimirInformacion();
       
       
        System.out.println(introduccion.obtenerInformacionAsignatura());
       introduccion.imprimirInformacion();
       
       
       
        
    }
    
}
