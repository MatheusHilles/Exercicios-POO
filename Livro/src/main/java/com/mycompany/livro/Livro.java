/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livro;

/**
 *
 * @author mathillesheim
 */
public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private static int totalLivros = 0;
    
    public Livro() {
        this.titulo = "Sem titulo";
        this.autor = "Desconhecido";
        this.anoPublicacao = 0;
        totalLivros ++;
    }
    
    public Livro(String titulo, String autor, int ano ){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        totalLivros ++;
        
    }
    
    public String exibirInfo() {
        return "Titulo: " + titulo + " Autor: " + autor + " Ano Publicado :" + anoPublicacao;
    }
    
    public String exibirInfo(boolean resumido) {
        if(resumido) {
            return "Titulo " + titulo;
        } else {
            
            return exibirInfo();
        }
        
    }

    public static int getTotalLivros() {
        return totalLivros;
    }
    
    
}
