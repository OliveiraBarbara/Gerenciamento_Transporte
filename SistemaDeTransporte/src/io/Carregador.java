/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author barbara
 */
public class Carregador {

    public static Object carregarObjeto(LeituraGravacao arq, String path) {
        return arq.lerObj(path);
    }

    public static HashMap<String, TreeSet<String>> carregarEstadosCidades(LeituraGravacao arqv) {
        return arqv.carregarEstadosCidades();
    }

}
