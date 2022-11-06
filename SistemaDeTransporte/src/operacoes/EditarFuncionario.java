/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import classes.Funcionario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import telas.CadastroFuncionario;

/**
 *
 * @author barbara
 */
public class EditarFuncionario {

    public static void editarFuncionario(ArrayList<Funcionario> funcionarios, String id, HashMap<String, TreeSet<String>> estadosCidades) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getIdFunc().equals(id)) {
                new CadastroFuncionario(funcionarios, estadosCidades);
                break;
            }
        }
    }
}
