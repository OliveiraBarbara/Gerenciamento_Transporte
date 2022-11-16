/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import classes.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author Vini_
 */
public class BuscaFuncionario {
    public static Funcionario buscarFuncionario(ArrayList<Funcionario> funcionarios, String usuario, String senha){
        for(Funcionario funcionario:funcionarios){
            if(funcionario.getUsuario().equals(usuario)){
                if(funcionario.getSenha().equals(senha)){
                    return funcionario;
                }
            }
        }
        return null;
    }
}
