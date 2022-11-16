/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author barbara
 */
public class Funcionario implements Serializable {

    private String idFunc;
    private String cpf;
    private String cargo;
    private String nome;
    private double salario;
    private String telefone;
    private String endereco;
    private int num;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String usuario;
    private String senha;

    public Funcionario(String cpf, String cargo, String nome, double salario, String telefone, String endereco, int num, String bairro, String cep, String cidade, String uf, String usuario, String senha) {
        UUID uuid = UUID.randomUUID();
        this.idFunc = uuid.toString();
        this.cpf = cpf;
        this.cargo = cargo;
        this.nome = nome;
        this.salario = salario;
        this.telefone = telefone;
        this.endereco = endereco;
        this.num = num;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getIdFunc() {
        return idFunc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
