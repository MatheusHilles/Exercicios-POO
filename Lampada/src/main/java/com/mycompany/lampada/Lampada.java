/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lampada;
public class Lampada {

    private boolean ligada;
    private String cor;
    private int potencia;

    public Lampada(String cor, int potencia) {
        this.ligada = false; // começa desligada
        this.cor = cor;
        this.potencia = potencia;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void alternarEstado() {
        ligada = !ligada;
    }

    public void trocarCor(String novaCor) {
        cor = novaCor;
    }

    public void mostrarStatus() {
        String estado = ligada ? "Ligada" : "Desligada";
        System.out.println("Lâmpada: " + estado + " | Cor: " + cor + " | Potência: " + potencia + "W");
    }
}
