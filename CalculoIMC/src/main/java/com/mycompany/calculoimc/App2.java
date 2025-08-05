/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculoimc;

/**
 *
 * @author mathe
 */
import java.util.Scanner;
public class App2 {

    public static void main (String[] args) {
    
    Scanner teclado = new Scanner(System.in);
        
    Pessoa pessoa1 = new Pessoa();
    
    System.out.println("Digite sua altura:");
    pessoa1.a = teclado.nextDouble();
    System.out.println("Digite seu peso:");
    pessoa1.p = teclado.nextDouble();
    
    System.out.println("O IMC da pessoa1 seria: " + pessoa1.calculoImc());
    }
}
