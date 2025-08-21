/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoa;

/**
 *
 * @author mathillesheim
 */
public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void apresentar() {
        System.out.println("Me chamo " + nome + " , tenho " + idade + " anos, e tenho " + altura + " de altura");
        
    }
   
    public int calcularIdade(int idade) {
        return this.idade + 30; 
    }

    
    public boolean maiorIdade() {
        return idade >= 18;
    }
    
}
