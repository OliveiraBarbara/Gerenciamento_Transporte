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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Principal;
import java.util.ArrayList;
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
    public void gravarUsuario(ArrayList<Usuario> usuarios) {
        File dir = new File("./dados");
        if (!dir.exists()) {
            dir.mkdir();
        }

        ObjectOutputStream file = null;
        try {
            file = new ObjectOutputStream(new FileOutputStream("./dados/usuarios.txt"));
            file.writeObject(usuarios);
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
    public ArrayList<Usuario> lerUsuario() {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        File dados = new File("./dados/usuarios.txt");
        if (!dados.exists()) {
            return usuarios;
        }

        ObjectInputStream file = null;
        try {
            file = new ObjectInputStream(new FileInputStream(dados));
            usuarios = (ArrayList<Usuario>) file.readObject();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        } finally {
            try {
                file.close();
            } catch (Exception ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            }
        }

        return usuarios;
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

    @Override
    public void gravarFuncionario(ArrayList<Funcionario> funcionarios) {
        File dir = new File("./dados");
        if (!dir.exists()) {
            dir.mkdir();
        }

        ObjectOutputStream file = null;
        try {
            file = new ObjectOutputStream(new FileOutputStream("./dados/funcionarios.txt"));
            file.writeObject(funcionarios);
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
    public ArrayList<Funcionario> lerFuncionario() {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        File dados = new File("./dados/funcionarios.txt");
        if (!dados.exists()) {
            return funcionarios;
        }

        ObjectInputStream file = null;
        try {
            file = new ObjectInputStream(new FileInputStream(dados));
            funcionarios = (ArrayList<Funcionario>) file.readObject();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        } finally {
            try {
                file.close();
            } catch (Exception ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            }
        }

        return funcionarios;
    }

    @Override
    public void gravarVeiculo(ArrayList<Veiculo> veiculos) {
        File dir = new File("./dados");
        if (!dir.exists()) {
            dir.mkdir();
        }

        ObjectOutputStream file = null;
        try {
            file = new ObjectOutputStream(new FileOutputStream("./dados/veiculos.txt"));
            file.writeObject(veiculos);
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
    public ArrayList<Veiculo> lerVeiculo() {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

        File dados = new File("./dados/veiculos.txt");
        if (!dados.exists()) {
            return veiculos;
        }

        ObjectInputStream file = null;
        try {
            file = new ObjectInputStream(new FileInputStream(dados));
            veiculos = (ArrayList<Veiculo>) file.readObject();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        } finally {
            try {
                file.close();
            } catch (Exception ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            }
        }

        return veiculos;
    }

    @Override
    public void gravarRota(ArrayList<Linha> linhas) {
        File dir = new File("./dados");
        if (!dir.exists()) {
            dir.mkdir();
        }

        ObjectOutputStream file = null;
        try {
            file = new ObjectOutputStream(new FileOutputStream("./dados/linhas.txt"));
            file.writeObject(linhas);
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
    public ArrayList<Linha> lerRota() {
        ArrayList<Linha> linhas = new ArrayList<Linha>();

        File dados = new File("./dados/linhas.txt");
        if (!dados.exists()) {
            return linhas;
        }

        ObjectInputStream file = null;
        try {
            file = new ObjectInputStream(new FileInputStream(dados));
            linhas = (ArrayList<Linha>) file.readObject();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        } finally {
            try {
                file.close();
            } catch (Exception ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            }
        }

        return linhas;
    }

}
