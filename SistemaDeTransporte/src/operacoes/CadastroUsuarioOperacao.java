/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import classes.Comum;
import classes.Estudante;
import classes.Idoso;
import classes.Usuario;
import io.Gravador;
import io.LeitorGravadorObj;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Vini_
 */
public class CadastroUsuarioOperacao {

    public static void cadastroUsuario(ArrayList<Usuario> usuarios, String cpf, String nome, String endereco, int num, String bairro, String cep, String cidade, String estado, String telefone, String tipo, String dataNasc, String localEstudo, String matriculaEscolar, String valeTranspote) throws ParseException {
        switch (tipo.toLowerCase()) {
            case "idoso":
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                Idoso idoso = new Idoso(formatter.parse(dataNasc), cpf, nome, endereco, num, bairro, cep, cidade, estado, telefone, tipo);
                usuarios.add(idoso);
                JOptionPane.showConfirmDialog(null, "Cadastrado com sucesso!", "Sucesso!", JOptionPane.DEFAULT_OPTION);
                break;
            case "estudante":
                Estudante estudante = new Estudante(matriculaEscolar, localEstudo, cpf, nome, endereco, num, bairro, cep, cidade, estado, telefone, tipo);
                usuarios.add(estudante);
                JOptionPane.showConfirmDialog(null, "Cadastrado com sucesso!", "Sucesso!", JOptionPane.DEFAULT_OPTION);
                break;
            case "comum":
                Comum comum = new Comum(valeTranspote, cpf, nome, endereco, num, bairro, cep, cidade, estado, telefone, tipo);
                usuarios.add(comum);
                JOptionPane.showConfirmDialog(null, "Cadastrado com sucesso!", "Sucesso!", JOptionPane.DEFAULT_OPTION);
                break;
            default:
                JOptionPane.showConfirmDialog(null, "Tipo de usuário invalido!", "Atenção!", JOptionPane.WARNING_MESSAGE);
                break;

        }
        Gravador.gravarUsuario(new LeitorGravadorObj(), usuarios);
    }
}
