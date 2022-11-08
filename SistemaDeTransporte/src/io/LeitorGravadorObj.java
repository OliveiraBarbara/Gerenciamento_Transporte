/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Principal;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author barbara
 */
public class LeitorGravadorObj implements LeituraGravacao {

    @Override
    public void gravarObj(Object objeto, String path) {
        File dir = new File("./dados");
        if (!dir.exists()) {
            dir.mkdir();
        }

        ObjectOutputStream file = null;
        try {
            file = new ObjectOutputStream(new FileOutputStream(path));
            file.writeObject(objeto);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        } finally {
            try {
                file.close();
            } catch (Exception ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
    }

    @Override
    public Object lerObj(String path) {
        Object objeto = new Object();

        File dados = new File(path);
        if (!dados.exists()) {
            return null;
        }

        ObjectInputStream file = null;
        try {
            file = new ObjectInputStream(new FileInputStream(dados));
            objeto = (Object) file.readObject();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        } finally {
            try {
                file.close();
            } catch (Exception ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            }
        }

        return objeto;
    }

    @Override
    public HashMap<String, TreeSet<String>> carregarEstadosCidades() {
        HashMap<String, TreeSet<String>> estadosCidades = new HashMap<String, TreeSet<String>>();

        File dados = new File("./dados/cidades.csv");
        if (!dados.exists()) {
            return estadosCidades;
        }

        BufferedReader file = null;
        try {
            file = new BufferedReader(new FileReader(dados));
            String linha = "";
            while ((linha = file.readLine()) != null) {
                String[] partes = linha.split(";");
                String estado = partes[0];
                String cidade = partes[1];

                if (estadosCidades.containsKey(estado)) {
                    estadosCidades.get(estado).add(cidade);
                } else {
                    TreeSet<String> cidades = new TreeSet<String>();
                    cidades.add(cidade);
                    estadosCidades.put(estado, cidades);
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        } finally {
            try {
                file.close();
            } catch (Exception ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            }
        }

        return estadosCidades;
    }
}
