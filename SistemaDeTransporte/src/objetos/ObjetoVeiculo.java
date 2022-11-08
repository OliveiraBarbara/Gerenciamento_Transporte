/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import classes.Veiculo;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author barbara
 */
public class ObjetoVeiculo implements Serializable{
    private ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    
    public void add(Veiculo veiculo){
        veiculos.add(veiculo);
    }
    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos= veiculos;
    }
}
