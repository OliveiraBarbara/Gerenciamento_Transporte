/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import classes.Funcionario;
import classes.Linha;
import classes.Usuario;
import classes.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author barbara
 */
public class Gravador {

    public static void gravarUsuario(LeituraGravacao arq, ArrayList<Usuario> usuarios) {
        arq.gravarUsuario(usuarios);
    }

    public static void gravarFuncionario(LeituraGravacao arq, ArrayList<Funcionario> funcionarios) {
        arq.gravarFuncionario(funcionarios);
    }

    public static void gravarVeiculo(LeituraGravacao arq, ArrayList<Veiculo> veiculos) {
        arq.gravarVeiculo(veiculos);
    }

    public static void gravarRota(LeituraGravacao arq, ArrayList<Linha> linhas) {
        arq.gravarRota(linhas);
    }
}
