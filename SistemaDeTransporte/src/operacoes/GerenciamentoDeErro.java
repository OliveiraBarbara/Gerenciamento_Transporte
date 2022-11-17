/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Luiz Henrick
 */
public class GerenciamentoDeErro {
    /*Este método recebe um componente e uma String sendo a mensagem do erro e após isso é apresentando em um JOptionPane a mensagem e
    se o campo for um JTextField ele seleciona td e após isso retorna o foco no determinado campo.*/
    public static void defineErrorField(JComponent campo, String msg) {
        JOptionPane.showMessageDialog(null, msg, "Transporte", JOptionPane.ERROR_MESSAGE);
        if (campo instanceof JTextField) {
            JTextField campoTexto = (JTextField) campo;
            campoTexto.selectAll();
        }
        campo.requestFocus();
    }
}
