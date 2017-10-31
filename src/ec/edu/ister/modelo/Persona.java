/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author LAB7-PC2-USER
 */
public class Persona {
    private String nombre;
    private String primerApellido;
    private Integer edad;
    public double cantidad;

    public Persona() {
        System.out.println("hola mundo");
    }

    public void  setPersona(String nom) {
        nombre = nom; 
    }

    public String getPersona() {
        return  nombre;    
    } 
    public void  setprimerApellido(String apellido) {
        primerApellido = apellido; 
    }

    public String getprimerApellido() {
        return  primerApellido;    
    } 
    
    public double obtenerCantidad(){
        return cantidad;    
    }
     
}
