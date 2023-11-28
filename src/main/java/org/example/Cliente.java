package org.example;

import java.util.ArrayList;

public class Cliente extends Pessoa{

    private ArrayList<Imovel> imoveis;

    public Cliente(String nomeCompleto, String endereco, String cpf, String email, ArrayList<Imovel> imoveis) {
        super(nomeCompleto, endereco, cpf, email);
        this.imoveis = imoveis;
    }

    public void adicionarImovel(Imovel imovel){

    }

    public void removerImovel(Imovel imovel){

    }

    public void listarImoveis(Imovel imovel){

    }
}
