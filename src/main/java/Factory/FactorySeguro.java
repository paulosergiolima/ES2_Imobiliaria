/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Conceitos.Seguro;
/**
 *
 * @author Roberto Augusto
 */
public class FactorySeguro {
    
    public Seguro criarSeguro(String nome, double valor, String descricao) {
        Seguro seguro = new Seguro(nome, valor, descricao);
        return seguro;
    }
}
