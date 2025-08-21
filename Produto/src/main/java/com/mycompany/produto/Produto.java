/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.produto;

/**
 *
 * @author CDA
 */
public class Produto {

    private String nome;
    private double preco;
    private int estoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void vender(int quantidade) {
        if(estoque >= quantidade) {
            estoque -= quantidade;
            System.out.println("Venda realizada");
        } else if (estoque > 0) {
            System.out.println("Quantidade Insuficiente");
        } else {
            System.out.println("Estoque zerado");
        }
    }   

    
    public void repor(int quantidade) {
        estoque += quantidade;
        System.out.println("Item adicionado");
    }
    
    
}
