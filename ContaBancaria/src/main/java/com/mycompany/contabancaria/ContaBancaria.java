/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabancaria;

/**
 *
 * @author mathillesheim
 */
public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if(valor < 0) {
            System.out.println("O valor não pode ser menor que zero");
        } else {
            saldo += valor;
        }
    }
    
    public void sacar(double valor) {
       if(valor < 0) {
            System.out.println("O valor não pode ser menor que zero");
       } else if (saldo >= valor) {
           saldo -= valor;
           
       } else {
           System.out.println("Saldo insuficiente");
       }
    }
    
    public void transferir(ContaBancaria contaDestino, double valor) {
        if(valor > 0 && saldo >= valor) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("O valor transferido foi: " + valor);
        } else {
            System.out.println("O valor não foi transferido, verifique o saldo da conta");
        }
    }
}
