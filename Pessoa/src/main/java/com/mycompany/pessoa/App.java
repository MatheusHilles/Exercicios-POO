/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

public class App {
    public static void main(String[] args) {
        // Criando 3 pessoas
        Pessoa p1 = new Pessoa("Maria", 20, 1.65);
        Pessoa p2 = new Pessoa("João", 17, 1.80);
        Pessoa p3 = new Pessoa("Ana", 30, 1.70);

        // Chamando apresentar()
        p1.apresentar();
        p2.apresentar();
        p3.apresentar();

        // Chamando calcularIdadeEm()
        System.out.println("Maria terá " + p1.calcularIdadeEm(2030) + " anos em 2030.");
        System.out.println("João terá " + p2.calcularIdadeEm(2030) + " anos em 2030.");
        System.out.println("Ana terá " + p3.calcularIdadeEm(2030) + " anos em 2030.");

        // Chamando ehMaiorIdade()
        System.out.println("Maria é maior de idade? " + p1.ehMaiorIdade());
        System.out.println("João é maior de idade? " + p2.ehMaiorIdade());
        System.out.println("Ana é maior de idade? " + p3.ehMaiorIdade());
    }
}

