/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author arnoldgutierrez
 */
public class IntroduccionIngenieria extends Asignatura {
    
    
    public IntroduccionIngenieria(){
        establecerNombre("Introduccion a la ingenieria");
        establecerCodigo("IER-09");
       
    }

    @Override
   public String obtenerInformacionAsignatura() {
return "Informacion para Itroccion a la ingenieria";
    }
    
    
    
    
}
