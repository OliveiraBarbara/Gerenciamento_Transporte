/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacao;

import execoes.validacao.PlacaInvalidaException;
import execoes.validacao.ValidacaoException;

/**
 *
 * @author Luiz Henrick
 */
public class ValidacaoPlaca implements Validacao{

    @Override
    public void validaCampo(String placa) throws ValidacaoException {
        placa = placa.trim();
        placa = placa.replace("-", "");
        if(!placa.matches("([A-Za-z]{3}\\d{4})|([A-Za-z]{3}\\d[A-Za-z]\\d{3})")){
            throw new PlacaInvalidaException();
        }
    }
    
}
