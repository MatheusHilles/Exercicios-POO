/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculoimc;

/**
 *
 * @author mathe
 */
public class App {

    public static void main (String[] args) {
    
    Pessoa pessoa1 = new Pessoa();
    
    pessoa1.a = 1.75;
    pessoa1.p = 78.0;
    
    System.out.println("O IMC da pessoa1 seria: " + pessoa1.calculoImc());
    }
}
