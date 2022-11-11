/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import classes.Linha;
import classes.Paradas;
import io.Gravador;
import io.LeitorGravadorObj;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import objetos.ObjetoLinha;

/**
 *
 * @author Vini_
 */
public class CadastroLinhaOperacao {
    public static void cadastroLinha(ArrayList<Paradas> paradas, ArrayList<Linha>linhas, String pontoInicial, String pontoFinal, String endereco, int numero, String bairro, String horario) throws ParseException{
        ObjetoLinha linha = new ObjetoLinha();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        Linha linhaNova = new Linha(pontoInicial,pontoFinal,endereco,paradas, bairro, numero,formatter.parse(horario));
        linhas.add(linhaNova);
        linha.setLinhas(linhas);
        Gravador.gravarObjeto(new LeitorGravadorObj(),linha, "./dados/linhas.txt");
    }
}
