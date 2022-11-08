/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.Serializable;

/**
 *
 * @author Vini_
 */
public class Comum extends Usuario implements Serializable {

    private String valeTransporte;

    public Comum(String valeTransporte, String cpf, String nome, String endereco, int num, String bairro, String cep, String cidade, String estado, String telefone, String tipo) {
        super(cpf, nome, endereco, num, bairro, cep, cidade, estado, telefone, tipo);
        this.valeTransporte = valeTransporte;
    }

    public String isValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(String valeTransporte) {
        this.valeTransporte = valeTransporte;
    }

}
