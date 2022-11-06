/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Vini_
 */
public class Linha implements Serializable, Comparable<Linha> {

    private String idLinha;
    private String pontoInicial;
    private String pontoFinal;
    private String endereco;

    public Linha(String pontoInicial, String pontoFinal, String endereco) {
        UUID uuid = UUID.randomUUID();
        this.idLinha = uuid.toString();
        this.pontoInicial = pontoInicial;
        this.pontoFinal = pontoFinal;
        this.endereco = endereco;
    }

    public String getIdLinha() {
        return idLinha;
    }

    public String getPontoInicial() {
        return pontoInicial;
    }

    public void setPontoInicial(String pontoInicial) {
        this.pontoInicial = pontoInicial;
    }

    public String getPontoFinal() {
        return pontoFinal;
    }

    public void setPontoFinal(String pontoFinal) {
        this.pontoFinal = pontoFinal;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public int compareTo(Linha l) {
        return this.idLinha.compareTo(l.getIdLinha());
    }

}
