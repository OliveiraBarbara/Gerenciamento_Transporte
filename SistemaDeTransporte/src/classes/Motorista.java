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
    
    public Motorista(String cpf, String cargo, String nome, double salario, String cnh, String turnoTrabalho) {
        super(cpf, cargo, nome, salario);
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
