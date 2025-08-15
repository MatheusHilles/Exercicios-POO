/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contadorsimples;
public class App {
    public static void main(String[] args) {
        
        ContadorSimples c1 = new ContadorSimples();
        ContadorSimples c2 = new ContadorSimples();
        
        for (int i = 0; i < 5; i++) {
            c1.incrementar();
        }
        
        for (int i = 0; i < 3; i++) {
            c2.decrementar();
        }
        
        c1.exibirEstado();
        c2.exibirEstado();
        
        c1.zerar();
        c1.exibirEstado();
    }
}
