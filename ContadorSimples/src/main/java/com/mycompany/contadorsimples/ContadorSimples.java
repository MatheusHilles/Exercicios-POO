/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contadorsimples;

public class ContadorSimples {
    private int valor;

    public ContadorSimples() {
        this.valor = 0;
    }

    public void incrementar() {
        valor++;
    }

    public void decrementar() {
        valor--;
    }

    public void zerar() {
        valor = 0;
    }

    public int obterValor() {
        return valor;
    }

    public void exibirEstado() {
        System.out.println("Contador está em: " + valor);
    }
}
