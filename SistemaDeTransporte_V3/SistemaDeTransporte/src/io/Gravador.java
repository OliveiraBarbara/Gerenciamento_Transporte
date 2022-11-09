/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import classes.Usuario;
import java.util.ArrayList;

/**
 *
 * @author barbara
 */
public class Gravador {

    public static void gravarBase(LeituraGravacao arq, ArrayList<Usuario> usuarios) {
        arq.gravarUsuario(usuarios);
    }

}
