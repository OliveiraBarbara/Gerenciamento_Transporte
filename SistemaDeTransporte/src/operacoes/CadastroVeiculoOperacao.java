/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import classes.Metro;
import classes.Onibus;
import classes.Trem;
import classes.Veiculo;
import io.Gravador;
import io.LeitorGravadorObj;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import objetos.ObjetoVeiculo;

/**
 *
 * @author barbara
 */
public class CadastroVeiculoOperacao {

    public static void cadastroVeiculo(ArrayList<Veiculo> veiculos, String dataAqui, int capacidade, String seguro, String integracao, String regioes, String bairro, String tipo, String modelo, String placa, String acessivel) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        ObjetoVeiculo veiculo = new ObjetoVeiculo();
        switch (tipo.toLowerCase()) {
            case "metrô":
                Metro metro = new Metro(tipo, capacidade, acessivel, seguro, integracao, formatter.parse(dataAqui), bairro);
                veiculos.add(metro);
                JOptionPane.showConfirmDialog(null, "Cadastrado com sucesso!", "Sucesso!", JOptionPane.DEFAULT_OPTION);
                break;
            case "trem":
                Trem trem = new Trem(tipo, capacidade, acessivel, seguro, integracao, formatter.parse(dataAqui), regioes);
                veiculos.add(trem);
                JOptionPane.showConfirmDialog(null, "Cadastrado com sucesso!", "Sucesso!", JOptionPane.DEFAULT_OPTION);
                break;
            case "ônibus":
                Onibus onibus = new Onibus(tipo, capacidade, acessivel, seguro, integracao, formatter.parse(dataAqui), placa, modelo);
                veiculos.add(onibus);
                JOptionPane.showConfirmDialog(null, "Cadastrado com sucesso!", "Sucesso!", JOptionPane.DEFAULT_OPTION);
                break;
            default:
                JOptionPane.showConfirmDialog(null, "Tipo de veículo invalido!", "Atenção!", JOptionPane.WARNING_MESSAGE);
                break;

        }
        veiculo.setVeiculos(veiculos);
        Gravador.gravarObjeto(new LeitorGravadorObj(), veiculo, "./dados/veiculos.txt");
    }
}
