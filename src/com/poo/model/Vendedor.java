/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class Vendedor extends Pessoa{
    private double salarioBase;
    private double comissao;
    private ArrayList<Pedido> pedidos;

    public Vendedor(double salarioBase, String cpf, String nome) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
    }
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }
    
    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
        pedido.setVendedor(this);
        
    }
    
    
}
