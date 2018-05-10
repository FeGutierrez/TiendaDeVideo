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
public class Account {
    private int id;
    private double credit;
    private Client owner;

    
    //Constructor    
    public Account(int id) {
        this.id = id;
        this.credit = 0.0;
        //UML especifica el saldo como 0.0 al crear la cuenta
        //El cliente se asocia despues        
    }
    
    //Asociar cliente
    public boolean asociarCliente (Client client){
        if(this.owner == null){
            this.owner = client;
            return true;
        } else {
            return false;
        }        
    }

    public Client getOwner() {
        return owner;
    }
    
    //Getter y Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
    
}
