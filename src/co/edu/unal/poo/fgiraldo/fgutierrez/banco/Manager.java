/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.poo.fgiraldo.fgutierrez.banco;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Manager extends Person{
    
    private String areaACargo;
    //El manager puede tener 0 o muchos clientes
    private ArrayList<Client> clientes;

    public Manager(String areaACargo, int cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
        this.areaACargo = areaACargo;
        this.clientes = new ArrayList<>();
    }

    public String getAreaACargo() {
        return areaACargo;
    }

    public void setAreaACargo(String areaACargo) {
        this.areaACargo = areaACargo;
    }

    public ArrayList<Client> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Client> clientes) {
        this.clientes = clientes;
    }
    
    
    
    
    
    
}
