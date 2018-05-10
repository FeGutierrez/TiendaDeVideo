/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.poo.fgiraldo.fgutierrez.banco;

/**
 *
 * @author Estudiante
 */
public class Client extends Person{
    
    private Manager managerAsignado;
    
    //Constructor
    public Client(int cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
    }
    
    
    //Asociar manager
    public boolean asignarManagerACliente(Manager manager){
        if (this.managerAsignado == null) {
            this.managerAsignado = manager;
            return true;
        } 
        //else
        return false;
    }
    
    //Retornar manager - get
    public Manager getManagerAsignado() {
        return managerAsignado;
    }  
    
    
}
