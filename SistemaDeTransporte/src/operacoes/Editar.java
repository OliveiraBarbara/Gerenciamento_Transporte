/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import classes.Funcionario;
import classes.Usuario;
import classes.Veiculo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import telas.CadastroFuncionario;
import telas.CadastroUsuario;
import telas.CadastroVeiculo;

/**
 *
 * @author barbara
 */
public class Editar {
    
    public static void editarVeiculo(ArrayList<Veiculo> veiculos, String id) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getId().equals(id)) {
                new CadastroVeiculo(veiculos, veiculo);
                break;
            }
        }
    }
    
    public static void editarUsuario(ArrayList<Usuario> usuarios, String id, HashMap<String, TreeSet<String>> estadosCidades) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUser().equals(id)) {
                new CadastroUsuario(usuarios, estadosCidades, usuario);
                break;
            }
        }
    }

    public static void editarFuncionario(ArrayList<Funcionario> funcionarios, String id, HashMap<String, TreeSet<String>> estadosCidades) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getIdFunc().equals(id)) {
                new CadastroFuncionario(funcionarios, estadosCidades, funcionario);
                break;
            }
        }
    }
}
