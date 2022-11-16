/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execoes.validacao;

/**
 *
 * @author Luiz Henrick
 */
public class PlacaInvalidaException extends ValidacaoException{
    
    public PlacaInvalidaException(){
        super("Formato de Placa Inválido");
    }
    
}
