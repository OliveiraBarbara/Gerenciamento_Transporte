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
public class Metro extends Veiculo implements Serializable{
    
    private String bairros;
    
    public Metro(String tipo, int capacidade, String acessibilidade, String seguro, String integracao, Date aquisicao, String bairros) {
        super(tipo, capacidade, acessibilidade, seguro, integracao, aquisicao);
        this.bairros = bairros;
    }

    public String getBairros() {
        return bairros;
    }

    public void setBairros(String bairros) {
        this.bairros = bairros;
    }

    
}
