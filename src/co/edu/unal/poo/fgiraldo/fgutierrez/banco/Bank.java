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
public class Bank {
    
    //Una persona puede ser cliente o Manager
    private String nombre;
    //Un banco puede tener 0 o muchos clientes
    private ArrayList<Client> clientes;
    //Un banco puede tener 0 o muchos managers
    private ArrayList<Manager> administradores;
    //Un banco puede tener 0 o muchas cuentas
    private ArrayList<Account> cuentas;
    
    //Todos los objetos son creados por el  banco ya que son composiciones

    public Bank(String nombre){
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.administradores = new ArrayList<>();
        this.cuentas = new ArrayList<>(); // Inicializarlos al crear el objeto de tipo Banco
    }
    
    public boolean crearClient(int cedula, String nombre, String apellido){
        Client cliente = new Client(cedula, nombre, apellido);
        this.clientes.add(cliente);
        return true;
    };
    
    public boolean crearManager(String areaAcargo, int cedula, String nombre, String apellido){
        Manager manager = new Manager(areaAcargo, cedula, nombre, apellido);
        this.administradores.add(manager);
        return true;
    };
    
    //int id
    public boolean crearAccount(int id){
        Account account = new Account(id);
        this.cuentas.add(account);
        return true;
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Client> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Client> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Manager> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(ArrayList<Manager> administradores) {
        this.administradores = administradores;
    }

    public ArrayList<Account> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Account> cuentas) {
        this.cuentas = cuentas;
    }
    
    public String listarClients(){
        String a = "";
        for (int i = 0; i < this.clientes.size(); i++) {
            a += this.clientes.get(i).getNombre() +" \n";
        }
        return a;
    };
    
    public String listarManagers(){
        String a = "";
        for (int i = 0; i < this.administradores.size(); i++) {
            a += this.administradores.get(i).getNombre();
        }
        return a;
    };
    public String listarAccounts(){
        String a = "";
        for (int i = 0; i < this.cuentas.size(); i++) {
            a += this.cuentas.get(i).getId()+ " " +this.cuentas.get(i).getOwner();
        }
        return a;
    };
    
    
    
    
}
