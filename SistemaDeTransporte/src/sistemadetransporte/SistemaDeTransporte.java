/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadetransporte;

import classes.Funcionario;
import classes.Usuario;
import io.Carregador;
import io.LeitorGravadorObj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
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
        ArrayList<Usuario> usuarios = Carregador.carregarUsuario(new LeitorGravadorObj());
        ArrayList<Funcionario> funcionarios = Carregador.carregarFuncionario(new LeitorGravadorObj());
        HashMap<String, TreeSet<String>> estadosCidades = Carregador.carregarEstadosCidades(new LeitorGravadorObj());
        criarGUI(usuarios, funcionarios, estadosCidades);
    }

    public static void criarGUI(ArrayList<Usuario> usuarios, ArrayList<Funcionario> funcionarios, HashMap<String, TreeSet<String>> estadosCidades) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login(usuarios, funcionarios, estadosCidades).setVisible(true);
            }
        });
    }
}
