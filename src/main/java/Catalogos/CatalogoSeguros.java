/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogos;

import java.util.ArrayList;

import Conceitos.Seguro;
/**
 *
 * @author Roberto Augusto
 */
public class CatalogoSeguros {
    private ArrayList<Seguro> seguros;
    
    public CatalogoSeguros() {
        this.seguros = new ArrayList<>();
    }
    
    public void registrarSeguro(Seguro seguro) {
        this.seguros.add(seguro);
    }
}
