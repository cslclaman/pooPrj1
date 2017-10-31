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
public class Pedido {
    private int Numero;
    private String dataEmissaoPedido;
    private String dataPagto;
    private boolean status;

    public Pedido(int Numero, String dataEmissaoPedido) {
        this.Numero = Numero;
        this.dataEmissaoPedido = dataEmissaoPedido;
    }
    
    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public int getNumero() {
        return Numero;
    }

    public String getDataEmissaoPedido() {
        return dataEmissaoPedido;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean isStatus() {
        return status;
    }
    
    
    
}
