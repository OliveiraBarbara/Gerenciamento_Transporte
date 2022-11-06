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
public class Trem extends Veiculo implements Serializable {

    private String regiao;

    public Trem(String tipo, int capacidade, String acessibilidade, String seguro, String integracao, Date aquisicao, String regiao) {
        super(tipo, capacidade, acessibilidade, seguro, integracao, aquisicao);
        this.regiao = regiao;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

}
