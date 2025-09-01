package com.mycompany.animal;

/**
 * Representa um Tutor com nome, telefone e endereço.
 * Permite cadastrar e atualizar informações do tutor.
 */
public class Tutor {

    /** Nome do tutor */
    private String nome;

    /** Telefone do tutor */
    private String telefone;

    /** Endereço do tutor */
    private String endereco;

    /**
     * Construtor padrão que inicializa com valores padrão.
     */
    public Tutor() {
        this.nome = "Sem nome";
        this.telefone = "Sem número";
        this.endereco = "Sem endereço";
    }

    /**
     * Construtor que inicializa o tutor com dados fornecidos.
     * @param nome Nome do tutor
     * @param endereco Endereço do tutor
     * @param telefone Telefone do tutor (não pode ser vazio)
     * @throws IllegalArgumentException se telefone estiver vazio
     */
    public Tutor(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.setTelefone(telefone);
    }

    /** @return Nome do tutor */
    public String getNome() {
        return nome;
    }

    /** @param nome Nome a ser definido para o tutor */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /** @return Telefone do tutor */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone do tutor.
     * @param telefone Telefone a ser definido (não pode ser vazio)
     * @throws IllegalArgumentException se telefone estiver vazio
     */
    public void setTelefone(String telefone) {
        if (telefone == null || telefone.isBlank()) {
            throw new IllegalArgumentException("O telefone do tutor não pode ser vazio");
        }
        this.telefone = telefone;
    }

    /** @return Endereço do tutor */
    public String getEndereco() {
        return endereco;
    }

    /** @param endereco Endereço a ser definido para o tutor */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
