package com.mycompany.animal;

/**
 * Representa um Animal com nome, espécie, idade e histórico.
 * Permite cadastrar e atualizar informações do animal.
 * @author Matheus
 */
public class Animal {

    /** Nome do animal */
    private String nome;

    /** Espécie do animal */
    private String especie;

    /** Idade do animal (em anos) */
    private int idade;

    /** Histórico de informações do animal */
    private String historico;

    /**
     * Construtor padrão que inicializa com valores padrão.
     */
    public Animal() {
        this.especie = "Sem espécie";
        this.nome = "Sem nome";
        this.idade = 0;
        this.historico = "Sem histórico";
    }

    /**
     * Construtor que inicializa o animal com dados fornecidos.
     * @param especie Espécie do animal
     * @param nome Nome do animal
     * @param historico Histórico do animal
     * @param idade Idade do animal (não pode ser negativa)
     * @throws IllegalArgumentException se idade < 0
     */
    public Animal(String especie, String nome, String historico, int idade) {
        this.especie = especie;
        this.nome = nome;
        this.setIdade(idade);
        this.historico = historico;
    }

    // ===================== Getters e Setters =====================

    /** @return Nome do animal */
    public String getNome() {
        return nome;
    }

    /** @param nome Nome a ser definido para o animal */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /** @return Espécie do animal */
    public String getEspecie() {
        return especie;
    }

    /** @param especie Espécie a ser definida para o animal */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /** @return Idade do animal */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade do animal.
     * @param idade Idade (não pode ser negativa)
     * @throws IllegalArgumentException se idade < 0
     */
    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade do animal não pode ser menor que 0");
        }
        this.idade = idade;
    }

    /** @return Histórico do animal */
    public String getHistorico() {
        return historico;
    }

    /** @param historico Histórico a ser definido para o animal */
    public void setHistorico(String historico) {
        this.historico = historico;
    }

    /**
     * Adiciona uma nova informação ao histórico do animal.
     * Se já existir histórico, acrescenta separado por ";"
     * @param descricao Informação a ser adicionada
     */
    public void adicionarHistorico(String descricao) {
        if (this.historico == null || this.historico.isBlank() || this.historico.equals("Sem histórico")) {
            this.historico = descricao;
        } else {
            this.historico += " ; " + descricao;
        }
    }
}
