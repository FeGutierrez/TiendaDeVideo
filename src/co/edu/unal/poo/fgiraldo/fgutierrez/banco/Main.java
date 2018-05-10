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
public class Main {
    public static void main(String[] args) {
        
        Bank banco = new Bank("Banco de la República");
        banco.crearClient(1234325, "Fellhipe", "Gutierrez");
        banco.crearManager("Cartera", 11111111, "Ivan", "García");
        banco.crearAccount(9998);
        
        
        
        System.out.println(banco.listarClients());
        System.out.println(banco.listarManagers());
        System.out.println(banco.listarAccounts());
        
        
        
    }
    
}
