package org.example;

public class Gerente extends Pessoa {

    private int idGerente;
    private Agenda agenda;

    public Gerente(String nomeCompleto, String endereco, String cpf, String email, Agenda agenda, int idGerente) {
        super(nomeCompleto, endereco, cpf, email);
        this.agenda = agenda;
        this.idGerente = idGerente;
    }

    public void checarAgenda(){
    }

    public void imprimirAgenda(){
    }
}
