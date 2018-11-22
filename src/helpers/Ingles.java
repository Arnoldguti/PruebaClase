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
public class Ingles extends Asignatura {
    
    
    public Ingles(){
    establecerNombre("Ingles");
    establecerCodigo("ING-0987");
    
    }

    @Override
   public String obtenerInformacionAsignatura() {
   return "Informacion para Ingles";
        
    }
    
    
}
