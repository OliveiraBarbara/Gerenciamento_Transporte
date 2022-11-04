/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Vini_
 */
public class Pagamento implements Serializable {

    private int idPagamento;
    private Date dataPagamento;
    private int qtdPasses;
    private double valor;

    public Pagamento(int idPagamento, Date dataPagamento, int qtdPasses, double valor) {
        this.idPagamento = idPagamento;
        this.dataPagamento = dataPagamento;
        this.qtdPasses = qtdPasses;
        this.valor = valor;
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public int getQtdPasses() {
        return qtdPasses;
    }

    public void setQtdPasses(int qtdPasses) {
        this.qtdPasses = qtdPasses;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
