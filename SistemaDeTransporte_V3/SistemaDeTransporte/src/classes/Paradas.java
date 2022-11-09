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
public class Paradas implements Serializable{
    private int idParadas;
    private String endereco;
    private String pontoParada;
    private Date horario;

    public Paradas(int idParadas, String endereco, String pontoParada, Date horario) {
        this.idParadas = idParadas;
        this.endereco = endereco;
        this.pontoParada = pontoParada;
        this.horario = horario;
    }

    public int getIdParadas() {
        return idParadas;
    }

    public void setIdParadas(int idParadas) {
        this.idParadas = idParadas;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPontoParada() {
        return pontoParada;
    }

    public void setPontoParada(String pontoParada) {
        this.pontoParada = pontoParada;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }
    
}
