/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.UsuarioInterface;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Vini_
 */
public class Usuario implements UsuarioInterface, Serializable {

    private String idUser;
    private String cpf;
    private String nome;
    private String endereco;
    private int num;
    private String bairro;
    private String cep;
    private String estado;
    private String cidade;
    private String telefone;
    private String tipo;

    public Usuario(String cpf, String nome, String endereco, int num, String bairro, String cep, String cidade, String estado, String telefone, String tipo) {
        UUID uuid = UUID.randomUUID();
        this.idUser = uuid.toString();
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.num = num;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.tipo = tipo;
    }

    public String getIdUser() {
        return idUser;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void calculaDesconto(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
