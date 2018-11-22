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
public abstract class Asignatura {
    
    //atributo
    private String nombre;
    
    private String codigo;
    
    private int periodo;
    
    public Asignatura(){
        //Constructor sin parametros
    }
    
   //Establecer y obtener
    public void establecerNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }
    
    
      //Establecer y obtener
    public void establecerCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String obtenerCodigo(){
        return this.codigo;
    }
    
    
    public void imprimirInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        
    }
    
    abstract String obtenerInformacionAsignatura();
    
    
    
}
