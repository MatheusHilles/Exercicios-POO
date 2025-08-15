/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoa;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private double altura;

    // Construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Método apresentar()
    public void apresentar() {
        System.out.println("Olá, eu sou " + nome + ", tenho " + idade + " anos e " + altura + "m de altura.");
    }

    // Método calcularIdadeEm()
    public int calcularIdadeEm(int ano) {
        int anoAtual = java.time.Year.now().getValue();
        return idade + (ano - anoAtual);
    }

    // Método ehMaiorIdade()
    public boolean ehMaiorIdade() {
        return idade >= 18;
    }
}

