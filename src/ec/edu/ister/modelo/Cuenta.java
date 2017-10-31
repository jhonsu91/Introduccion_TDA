/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;
/**
 * @author JHONSUPC
 */
public class Cuenta {
    private String id;
    private Double saldo;

    public void depositar(double monto) {
        saldo =monto + saldo;
    }
    
    public Cuenta(String id) {
        this.id=id;
    }
    
    public Double getSaldo() {
        return saldo;
    }
   
}
