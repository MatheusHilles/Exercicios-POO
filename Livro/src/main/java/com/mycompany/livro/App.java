/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livro;

import java.util.Scanner;

/**
 *
 * @author mathillesheim
 */
public class App {
 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Deseja cadastrar quantos livros?");
        int l = teclado.nextInt();
        
        Livro[] livros = new Livro[l];
        
        for(int i = 0; i < l; i++){
            System.out.println("Cadastro Livro" + (i + 1));
            System.out.println("Titulo");
            String titulo = teclado.next();
            
            System.out.println("Autor");
            String autor = teclado.next();
            
            System.out.println("Ano de Publicação");
            int anoPublicacao = teclado.nextInt();
            
            livros[i] = new Livro(titulo, autor, anoPublicacao);
        }
        
        System.out.println("Informações");
        for (Livro livro : livros) {
            System.out.println(livro.exibirInfo());
        }
        
        System.out.println("Total Livros " + Livro.getTotalLivros());
        
        if (l > 0) {
            System.out.println("Exebição Resumida");
            System.out.println(livros[0].exibirInfo(false));
        }

        teclado.close();
    
    }
}
