/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import classes.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;


/**
 *
 * @author barbara
 */
public interface LeituraGravacao {
    
    public abstract void gravarUsuario(ArrayList<Usuario> usuarios);
    
    public abstract ArrayList<Usuario> lerUsuario();
    
    public abstract HashMap<String, TreeSet<String>> carregarEstadosCidades();
    
}
