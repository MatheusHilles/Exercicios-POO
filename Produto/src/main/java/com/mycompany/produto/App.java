/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produto;

/**
 *
 * @author CDA
 */
public class App {
    
    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        p1.setNome("Cenoura");
        p1.setPreco(5);
        
        p1.repor(50);
        
        p1.vender(10);
        
        p1.setPreco(-5);
        p1.setPreco(0);
    }
}
