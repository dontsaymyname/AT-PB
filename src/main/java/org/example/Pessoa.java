package org.example;

public abstract class Pessoa {
    protected String nomeCompleto;
    protected String endereco;
    protected String cpf;
    protected String email;

    public Pessoa(String nomeCompleto, String endereco, String cpf, String email) {
        this.nomeCompleto = nomeCompleto;
        this.endereco = endereco;
        this.cpf = cpf;
        this.email = email;
    }
}