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
public class Motorista extends Funcionario implements Serializable {

    private String cnh;
    private String turnoTrabalho;
    
    public Motorista(String cpf, String cargo, String nome, double salario, String telefone, String endereco, int num, String bairro, String cep, String cidade, String uf, String cnh, String turnoTrabalho, String usuario,String senha) {
        super(cpf, cargo, nome, salario, telefone, endereco, num, bairro, cep, cidade, uf,usuario,senha);
        this.cnh = cnh;
        this.turnoTrabalho = turnoTrabalho;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getTurnoTrabalho() {
        return turnoTrabalho;
    }

    public void setTurnoTrabalho(String turnoTrabalho) {
        this.turnoTrabalho = turnoTrabalho;
    }
}
