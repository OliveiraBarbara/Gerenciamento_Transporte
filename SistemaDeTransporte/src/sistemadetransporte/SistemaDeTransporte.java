/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadetransporte;

import classes.Funcionario;
import classes.Linha;
import classes.Usuario;
import classes.Veiculo;
import io.Carregador;
import io.LeitorGravadorObj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import objetos.ObjetoFuncionario;
import objetos.ObjetoLinha;
import objetos.ObjetoUsuario;
import objetos.ObjetoVeiculo;
import telas.Login;

/**
 *
 * @author barbara
 */
public class SistemaDeTransporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ObjetoUsuario usuarios = (ObjetoUsuario) Carregador.carregarObjeto(new LeitorGravadorObj(), "./dados/usuarios.txt");
        if(usuarios == null){
            usuarios = new ObjetoUsuario();
        }
        ObjetoFuncionario funcionarios = (ObjetoFuncionario) Carregador.carregarObjeto(new LeitorGravadorObj(),"./dados/funcionarios.txt");
        if(funcionarios == null){
            funcionarios = new ObjetoFuncionario();
        }
        ObjetoVeiculo veiculos = (ObjetoVeiculo) Carregador.carregarObjeto(new LeitorGravadorObj(), "./dados/veiculos.txt");
        if(veiculos == null){
            veiculos = new ObjetoVeiculo();
        }
        ObjetoLinha linhas = (ObjetoLinha) Carregador.carregarObjeto(new LeitorGravadorObj(),"./dados/linhas.txt");
        if(linhas == null){
            linhas = new ObjetoLinha();
        }
        HashMap<String, TreeSet<String>> estadosCidades = Carregador.carregarEstadosCidades(new LeitorGravadorObj());
        criarGUI(usuarios.getUsuarios(), funcionarios.getFuncionarios(), veiculos.getVeiculos(), linhas.getLinhas(), estadosCidades);
    }

    public static void criarGUI(ArrayList<Usuario> usuarios, ArrayList<Funcionario> funcionarios, ArrayList<Veiculo> veiculos, ArrayList<Linha> linhas, HashMap<String, TreeSet<String>> estadosCidades) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login(usuarios, funcionarios, veiculos, linhas, estadosCidades).setVisible(true);
            }
        });
    }
}
