/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
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
    private String bairro;
    private int numero;
    private Date horario;
    private ArrayList<Paradas> paradas;


    public Linha(String pontoInicial, String pontoFinal, String endereco, ArrayList<Paradas> paradas,String bairro,int numero, Date horario) {
        UUID uuid = UUID.randomUUID();
        this.idLinha = uuid.toString();
        this.pontoInicial = pontoInicial;
        this.pontoFinal = pontoFinal;
        this.endereco = endereco;
        this.paradas = paradas;
        this.bairro = bairro;
        this.horario = horario;
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public ArrayList<Paradas> getParadas() {
        return paradas;
    }

    public void setParadas(ArrayList<Paradas> paradas) {
        this.paradas = paradas;
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
