/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import java.util.HashMap;
import java.util.TreeSet;
import javax.swing.JComboBox;

/**
 *
 * @author barbara
 */
public class CarregarDados {
    
    public static void carregarCidades(String estado, JComboBox cbCidade, HashMap<String, TreeSet<String>> estadosCidades) {
        cbCidade.removeAllItems();
        for (String cidade : estadosCidades.get(estado)) {
            cbCidade.addItem(cidade);
        }
    }

    public static void carregarEstados(JComboBox cbEstado, HashMap<String, TreeSet<String>> estadosCidades) {
        TreeSet<String> estados = new TreeSet<String>(estadosCidades.keySet());

        for (String estado : estados) {
            cbEstado.addItem(estado);
        }
    }
}
