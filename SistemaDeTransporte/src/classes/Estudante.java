/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.Serializable;

/**
 *
 * @author Vini_
 */
public class Estudante extends Usuario implements Serializable {

    private String matriculaEscolar;
    private String localEstudo;

    public Estudante(String matriculaEscolar, String localEstudo, String cpf, String nome, String endereco, String cidade, String telefone, String tipo) {
        super(cpf, nome, endereco, cidade, telefone, tipo);
        this.matriculaEscolar = matriculaEscolar;
        this.localEstudo = localEstudo;
    }

    public String getMatriculaEscolar() {
        return matriculaEscolar;
    }

    public void setMatriculaEscolar(String matriculaEscolar) {
        this.matriculaEscolar = matriculaEscolar;
    }

    public String getLocalEstudo() {
        return localEstudo;
    }

    public void setLocalEstudo(String localEstudo) {
        this.localEstudo = localEstudo;
    }

}
