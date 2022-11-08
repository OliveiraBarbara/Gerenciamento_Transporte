/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import classes.Funcionario;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author barbara
 */
public class ObjetoFuncionario implements Serializable{
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    public void add(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
