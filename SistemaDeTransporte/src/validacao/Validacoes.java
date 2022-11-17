/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacao;

import execoes.validacao.ValidacaoException;

/**
 *
 * @author Luiz Henrick
 */
public enum Validacoes {
    PLACA (new ValidacaoPlaca());
    
    private Validacao validacao;
    
    Validacoes(Validacao validacao){
        this.validacao = validacao;
    }
    
    public void valida(String campo) throws ValidacaoException{
        validacao.validaCampo(campo);
    } 
}
