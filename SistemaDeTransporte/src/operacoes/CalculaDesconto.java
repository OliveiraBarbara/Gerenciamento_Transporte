/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import classes.Usuario;
import enums.Desconto;
import interfaces.UsuarioInterface;

/**
 *
 * @author Vini_
 */
public class CalculaDesconto{

    public static double calculaDesconto(String tipo , double valor) {
        if(tipo.toLowerCase().equals("estudante")){
            valor = valor * Desconto.ESTUDANTE.getValor();
        }else if(tipo.toLowerCase().equals("idoso")){
            valor = valor * Desconto.IDOSO.getValor();
        }else if(tipo.toLowerCase().equals("comum")){
            valor = valor * Desconto.COMUM.getValor();
        }
        return valor;
    }
    
}
