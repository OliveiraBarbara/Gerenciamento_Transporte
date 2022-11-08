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
public interface LeituraGravacao {

    public abstract void gravarObj(Object objeto, String path);

    public abstract Object lerObj(String path);

    public abstract HashMap<String, TreeSet<String>> carregarEstadosCidades();    
}
