/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo.model;

/**
 *
 * @author Pc
 */
public class ItemPedido {
    private int numeroItem;
    private int qtdeVendida;

    public ItemPedido(int numeroItem, int qtdeVendida) {
        this.numeroItem = numeroItem;
        this.qtdeVendida = qtdeVendida;
    }

    public void setQtdeVendida(int qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }
    
    public int getNumeroItem() {
        return numeroItem;
    }

    public int getQtdeVendida() {
        return qtdeVendida;
    }
    
}
