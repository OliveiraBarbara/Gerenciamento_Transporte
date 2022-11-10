/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import classes.Paradas;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Vini_
 */
public class AddParadaOperacao {
    public static void addParada(ArrayList<Paradas> paradas, String endereco, String pontoParada, String horario) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Paradas parada = new Paradas(endereco, pontoParada, formatter.parse(horario));
        paradas.add(parada);
    }
}
