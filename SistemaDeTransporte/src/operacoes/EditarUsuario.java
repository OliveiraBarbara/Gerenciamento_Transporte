/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import classes.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import telas.CadastroUsuario;

/**
 *
 * @author barbara
 */
public class EditarUsuario {
    
    public static void editarUsuario(ArrayList<Usuario> usuarios, String id, HashMap<String, TreeSet<String>> estadosCidades) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUser().equals(id)) {
                new CadastroUsuario(usuarios, estadosCidades, usuario);
                break;
            }
        }
    }
}
