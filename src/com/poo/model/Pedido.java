package com.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Airton Brasil 0030481611002
 * @author Allan Flores 0030481611001
 * @author Caique Siqueira 0030481611009
 */
public class Pedido {
    private int Numero;
    private String dataEmissaoPedido;
    private String dataPagto;
    private boolean status;
    private Cliente cliente;
    private ArrayList<ItemPedido> itensPedidos;

    public Pedido(int Numero, String dataEmissaoPedido) {
        this.Numero = Numero;
        this.dataEmissaoPedido = dataEmissaoPedido;
        itensPedidos = new ArrayList<ItemPedido>();
    }
    
    public String getDataPagto() {
        return dataPagto;
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public boolean getStatus() {
        return status;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void addPedido(ItemPedido itemPedido){
        itensPedidos.add(itemPedido);
        itemPedido.setPedido(this);
    }
}
