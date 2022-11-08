/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import classes.Linha;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author barbara
 */
public class ObjetoLinha implements Serializable{
    private ArrayList<Linha> linhas = new ArrayList<Linha>();
    
    public void add(Linha linha){
        linhas.add(linha);
    }
    public ArrayList<Linha> getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList<Linha> linhas) {
        this.linhas = linhas;
    }
    
}
