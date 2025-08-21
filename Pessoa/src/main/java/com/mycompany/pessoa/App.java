/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author mathillesheim
 */
public class App {
    
    public static void main(String[] args) {
        
        
        Pessoa p1 = new Pessoa();
    
        p1.setNome("Maria");
        p1.setIdade(22);
        p1.setAltura(1.50);
    
        Pessoa p2 = new Pessoa();
        p2.setNome("João");
        p2.setIdade(23);
        p2.setAltura(1.60);
        
        Pessoa p3 = new Pessoa();
        p3.setNome("Dudu");
        p3.setIdade(26);
        p3.setAltura(1.45);
    
        p1.apresentar();
        p2.apresentar();
        p3.apresentar();
    
        System.out.println(p1.getNome() + " tera " + p1.calcularIdade(30) + " anos daqui a 30 anos.");
        System.out.println(p2.getNome() + " tera " + p2.calcularIdade(30) + " anos daqui a 30 anos.");
        System.out.println(p3.getNome() + " tera " + p3.calcularIdade(30) + " anos daqui a 30 anos.");
        
        System.out.println(p1.getNome() + " é maior de idade? " + p1.maiorIdade());
        System.out.println(p2.getNome() + " é maior de idade? " + p2.maiorIdade());
        System.out.println(p3.getNome() + " é maior de idade? " + p3.maiorIdade());
    
    }
}
