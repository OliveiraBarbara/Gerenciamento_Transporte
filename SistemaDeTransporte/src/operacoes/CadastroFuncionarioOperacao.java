/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import classes.Funcionario;
import classes.Gerente;
import classes.Motorista;
import classes.Secretaria;
import io.Gravador;
import io.LeitorGravadorObj;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author barbara
 */
public class CadastroFuncionarioOperacao {
    
    public static void cadastroFuncionario(ArrayList<Funcionario> funcionarios, String cpf, String cargo, String nome, double salario, String setorResponsável, String cnh, String turnoTrabalho, String especialidade, String localAtendimento) throws ParseException {
        switch (cargo.toLowerCase()) {
            case "motorista":
                Motorista motorista = new Motorista(cpf, cargo, nome, salario, cnh, turnoTrabalho);
                funcionarios.add(motorista);
                JOptionPane.showConfirmDialog(null, "Cadastrado com sucesso!", "Sucesso!", JOptionPane.DEFAULT_OPTION);
                break;
            case "secretária":
                Secretaria secretaria = new Secretaria(cpf, cargo, nome, salario, especialidade, localAtendimento);
                funcionarios.add(secretaria);
                JOptionPane.showConfirmDialog(null, "Cadastrado com sucesso!", "Sucesso!", JOptionPane.DEFAULT_OPTION);
                break;
            case "gerente":
                Gerente gerente = new Gerente(cpf, cargo, nome, salario, setorResponsável);
                funcionarios.add(gerente);
                JOptionPane.showConfirmDialog(null, "Cadastrado com sucesso!", "Sucesso!", JOptionPane.DEFAULT_OPTION);
                break;
            default:
                JOptionPane.showConfirmDialog(null, "Tipo de usuário invalido!", "Atenção!", JOptionPane.WARNING_MESSAGE);
                break;

        }
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome());
        }
        Gravador.gravarFuncionario(new LeitorGravadorObj(), funcionarios);
    }
    
}
