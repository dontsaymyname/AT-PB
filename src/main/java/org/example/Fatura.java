package org.example;

import java.util.Date;

public class Fatura {

    private double valor;
    private Date dataEmissao;
    private Date dataVencimento;
    private double valorPago;
    private Servico servico;

    public Fatura(double valor, Date dataEmissao, Date dataVencimento, double valorPago, Servico servico) {
        this.valor = valor;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
        this.valorPago = valorPago;
        this.servico = servico;
    }

    public void atualizarPagamentoParcial(double valor) {
    }
}
