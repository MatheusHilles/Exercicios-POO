/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lampada;

public class App {
    public static void main(String[] args) {
        
        Lampada lamp1 = new Lampada("Branca", 60);
        
        lamp1.mostrarStatus();
        
        lamp1.ligar();
        lamp1.mostrarStatus();
        
        lamp1.trocarCor("Amarela");
        lamp1.mostrarStatus();
        
        lamp1.alternarEstado(); 
        lamp1.mostrarStatus();
        
        lamp1.alternarEstado(); 
        lamp1.mostrarStatus();
    }
}

