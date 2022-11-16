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
public class Secretaria extends Funcionario implements Serializable {

    private String especialidade;
    private String localAtendimento;
    
    public Secretaria(String cpf, String cargo, String nome, double salario, String telefone, String endereco, int num, String bairro, String cep, String cidade, String uf, String especialidade, String localAtendimento, String usuario, String senha) {
        super(cpf, cargo, nome, salario, telefone, endereco, num, bairro, cep, cidade, uf,usuario, senha);
        this.especialidade = especialidade;
        this.localAtendimento = localAtendimento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getLocalAtendimento() {
        return localAtendimento;
    }

    public void setLocalAtendimento(String localAtendimento) {
        this.localAtendimento = localAtendimento;
    }
    
    

}
