package com.mycompany.animal;

import java.util.Scanner;

/**
 * Classe principal do programa.
 * Permite cadastrar tutores e animais, validar dados e exibir informações.
 * Demonstra o uso de try/catch para tratar exceções de entrada inválida.
 */
public class Main {

    /**
     * Método principal que executa o programa.
     * @param args Argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // ================= Cadastro de Tutores =================
        System.out.println("=== Cadastro de Tutores ===");
        Tutor[] tutores = new Tutor[2];

        for (int i = 0; i < tutores.length; i++) {
            System.out.println("\n--- Tutor " + (i + 1) + " ---");

            System.out.print("Nome: ");
            String nome = teclado.nextLine();

            System.out.print("Endereço: ");
            String endereco = teclado.nextLine();

            System.out.print("Telefone: ");
            String telefone = teclado.nextLine();

            // Tenta criar o tutor, capturando exceção se o telefone for vazio
            try {
                tutores[i] = new Tutor(nome, endereco, telefone);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao cadastrar tutor: " + e.getMessage());
                i--; // volta para refazer o cadastro
            }
        }

        // ================= Cadastro de Animais =================
        System.out.println("\n=== Cadastro de Animais ===");
        Animal[] animais = new Animal[3];

        for (int i = 0; i < animais.length; i++) {
            System.out.println("\n--- Animal " + (i + 1) + " ---");

            System.out.print("Nome: ");
            String nome = teclado.nextLine();

            System.out.print("Espécie: ");
            String especie = teclado.nextLine();

            System.out.print("Histórico: ");
            String historico = teclado.nextLine();

            System.out.print("Idade: ");
            int idade;
            try {
                idade = Integer.parseInt(teclado.nextLine()); // valida se é um número inteiro
            } catch (NumberFormatException e) {
                System.out.println("Idade inválida! Digite um número inteiro.");
                i--; // volta para refazer o cadastro
                continue;
            }

            // Tenta criar o animal, capturando exceção se a idade for negativa
            try {
                animais[i] = new Animal(especie, nome, historico, idade);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao cadastrar animal: " + e.getMessage());
                i--; // volta para refazer o cadastro
            }
        }

        // ================= Atualização do histórico =================
        // Exemplo de uso do método adicionarHistorico()
        animais[0].adicionarHistorico("Consultas regulares");

        // ================= Exibição dos Animais =================
        System.out.println("\n=== Dados dos Animais ===");
        for (int i = 0; i < animais.length; i++) {
            System.out.println("\nAnimal " + (i + 1));
            System.out.println("Nome: " + animais[i].getNome());
            System.out.println("Espécie: " + animais[i].getEspecie());
            System.out.println("Idade: " + animais[i].getIdade());
            System.out.println("Histórico: " + animais[i].getHistorico());
        }

        // ================= Exibição dos Tutores =================
        System.out.println("\n=== Dados dos Tutores ===");
        for (int i = 0; i < tutores.length; i++) {
            System.out.println("\nTutor " + (i + 1));
            System.out.println("Nome: " + tutores[i].getNome());
            System.out.println("Endereço: " + tutores[i].getEndereco());
            System.out.println("Telefone: " + tutores[i].getTelefone());
        }

        teclado.close(); // fecha o scanner
    }
}
