/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author Vini_
 */
public enum Desconto {
    ESTUDANTE(0.5),
    IDOSO(0.0),
    COMUM(1.0);
    private double valor;

    Desconto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
