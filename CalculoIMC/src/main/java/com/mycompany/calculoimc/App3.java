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
public class App3 {

    public static void main (String[] args) {
    
    Scanner teclado = new Scanner(System.in);
        
    Pessoa pessoa1 = new Pessoa();
    
    System.out.println("Digite sua altura:");
    pessoa1.a = teclado.nextDouble();
    System.out.println("Digite seu peso:");
    pessoa1.p = teclado.nextDouble();
    
    System.out.println("O IMC da pessoa1 seria: " + pessoa1.calculoImc());
    
    Pessoa pessoa2 = new Pessoa();
    
    System.out.println("Digite sua altura:");
    pessoa2.a = teclado.nextDouble();
    System.out.println("Digite seu peso:");
    pessoa2.p = teclado.nextDouble();
    
    System.out.println("O IMC da pessoa2 seria: " + pessoa2.calculoImc());
    
    
    Pessoa pessoa3 = new Pessoa();
    
    System.out.println("Digite sua altura:");
    pessoa3.a = teclado.nextDouble();
    System.out.println("Digite seu peso:");
    pessoa3.p = teclado.nextDouble();
    
    System.out.println("O IMC da pessoa3 seria: " + pessoa3.calculoImc());
    }
    
}
