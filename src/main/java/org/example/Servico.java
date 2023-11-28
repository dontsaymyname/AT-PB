package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Servico {

    public Imovel imovel;
    public Gerente gerente;
    public Date dataCotacao;
    public double valor;
    public Date dataExecucao;
    public ArrayList<Faxineiro> equipe;
    public boolean avaliacao;
    public Fatura fatura;

    public Servico(Imovel imovel, Gerente gerente, Date dataHoraCotacao, double valor, Date dataHoraExecucao, Fatura fatura) {
        this.imovel = imovel;
        this.gerente = gerente;
        this.dataCotacao = dataHoraCotacao;
        this.valor = valor;
        this.dataExecucao = dataHoraExecucao;
        this.equipe = new ArrayList<>();
        this.avaliacao = false;
        this.fatura = fatura;
    }

    public void agendarVisitaCotacao(Gerente gerente, Date data, Imovel imovel){
    }

    public void agendarExecucaoServico(Date data){
    }

    public void adicionarFaxineiro(Faxineiro faxineiro){
    }

    public void avaliarServico(int nota){
    }

}
