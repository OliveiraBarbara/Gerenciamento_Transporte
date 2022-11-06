/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.Serializable;

/**
 *
 * @author barbara
 */
public class Gerente extends Funcionario implements Serializable {

    private String setorResponsavel;
    
    public Gerente(String cpf, String cargo, String nome, double salario, String endereco, int num, String bairro, String cep, String cidade, String uf, String setorResponsavel) {
        super(cpf, cargo, nome, salario, endereco, num, bairro, cep, cidade, uf);
        this.setorResponsavel = setorResponsavel;
    }

    public String getSetorResponsavel() {
        return setorResponsavel;
    }

    public void setSetorResponsavel(String setorResponsavel) {
        this.setorResponsavel = setorResponsavel;
    }
}
