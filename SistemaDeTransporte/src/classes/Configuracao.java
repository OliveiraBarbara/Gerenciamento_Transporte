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
public class Configuracao implements Serializable{
    private double valorOnibus;
    private double valorTrem;
    private double valorMetro;

    public Configuracao() {
        this.valorOnibus = 0.00;
        this.valorTrem = 0.00;
        this.valorMetro = 0.00;
    }

    public double getValorOnibus() {
        return valorOnibus;
    }

    public void setValorOnibus(double valorOnibus) {
        this.valorOnibus = valorOnibus;
    }

    public double getValorTrem() {
        return valorTrem;
    }

    public void setValorTrem(double valorTrem) {
        this.valorTrem = valorTrem;
    }

    public double getValorMetro() {
        return valorMetro;
    }

    public void setValorMetro(double valorMetro) {
        this.valorMetro = valorMetro;
    }
    
}
