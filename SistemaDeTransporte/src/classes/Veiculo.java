/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.VeiculoInterface;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author barbara
 */
public class Veiculo implements Serializable, Comparable<Veiculo> {

    private String id;
    private String tipo;
    private int capacidade;
    private String acessibilidade;
    private String seguro;
    private String integracao;
    private Date aquisicao;

    public Veiculo(String tipo, int capacidade, String acessibilidade, String seguro, String integracao, Date aquisicao) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.acessibilidade = acessibilidade;
        this.seguro = seguro;
        this.integracao = integracao;
        this.aquisicao = aquisicao;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getAcessibilidade() {
        return acessibilidade;
    }

    public void setAcessibilidade(String acessibilidade) {
        this.acessibilidade = acessibilidade;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public String getIntegracao() {
        return integracao;
    }

    public void setIntegracao(String integracao) {
        this.integracao = integracao;
    }

    public Date getAquisicao() {
        return aquisicao;
    }

    public void setAquisicao(Date aquisicao) {
        this.aquisicao = aquisicao;
    }

    @Override
    public int compareTo(Veiculo v) {
        return this.id.compareTo(v.getId());
    }

}
