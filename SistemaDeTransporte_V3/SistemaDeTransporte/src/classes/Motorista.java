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
public class Motorista extends Funcionario implements Serializable{

    public Motorista(String cpf, String cargo, String nome, double salario) {
        super(cpf, cargo, nome, salario);
    }
    
}