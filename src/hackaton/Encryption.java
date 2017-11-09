/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackaton;

/**
 *
 * @author Davi
 */
abstract class Encryption {
    //***Atributos***
    protected final String ALGORITHM = "RSA";
    
    
    //***Métodos***
    
    /**
     * Método utilizado para criptografar os textos
     * @param text Texto a ser criptografado
     * @param Key Chave para criptografia
     * @return  Texto criptografado
     */
    
    abstract byte[] encryptText(String text, Object Key);
    /**
     * Método utilizado para descriptografar textos
     * @param text texto criptografado
     * @param Key chave para descriptografar
     * @return retorna o texto descriptografado
     */
    abstract String decryptText(String text, Object Key);
}
