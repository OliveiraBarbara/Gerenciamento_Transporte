/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Vini_
 */
public class Idoso extends Usuario implements Serializable{
    private Date dataNasc;

    public Idoso(Date dataNasc, String cpf, String nome, String endereco, String cidade, String telefone, String tipo) {
        super(cpf, nome, endereco, cidade, telefone, tipo);
        this.dataNasc = dataNasc;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    
}
