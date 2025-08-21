/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabancaria;

/**
 *
 * @author mathillesheim
 */
public class App {
    
    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setTitular("Maria");
        conta1.setNumero("111");
        
        ContaBancaria conta2 = new ContaBancaria();
        conta2.setTitular("João");
        conta2.setNumero("222");
        
        conta1.depositar(1000);
        conta1.depositar(700);
        
        conta2.depositar(5000);
        
        conta2.sacar(3000);
        
        conta2.transferir(conta1, 1800);
        
        System.out.println("Titular: " + conta1.getTitular() + " o saldo seria: " + conta1.getSaldo());
        System.out.println("Titular: " + conta2.getTitular() + " o saldo seria: " + conta2.getSaldo());
        
        
    }
    
    
}
