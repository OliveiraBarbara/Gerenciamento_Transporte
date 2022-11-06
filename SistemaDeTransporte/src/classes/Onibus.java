/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author barbara
 */
public class Onibus extends Veiculo implements Serializable {

    private String placa;
    private String modelo;

    public Onibus(String tipo, int capacidade, String acessibilidade, String seguro, String integracao, Date aquisicao, String placa, String modelo) {
        super(tipo, capacidade, acessibilidade, seguro, integracao, aquisicao);
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
