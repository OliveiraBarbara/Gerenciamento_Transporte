/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import classes.Funcionario;
import classes.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author barbara
 */
public class Carregador {

    public static ArrayList<Usuario> carregarUsuario(LeituraGravacao arq) {
        return arq.lerUsuario();
    }

    public static HashMap<String, TreeSet<String>> carregarEstadosCidades(LeituraGravacao arqv) {
        return arqv.carregarEstadosCidades();
    }

    public static ArrayList<Funcionario> carregarFuncionario(LeituraGravacao arq) {
        return arq.lerFuncionario();
    }
}
