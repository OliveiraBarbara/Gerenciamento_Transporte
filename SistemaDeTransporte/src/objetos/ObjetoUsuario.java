/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import classes.Usuario;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author barbara
 */
public class ObjetoUsuario implements Serializable{
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    
    public void add(Usuario usuario){
        usuarios.add(usuario);
    }
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
