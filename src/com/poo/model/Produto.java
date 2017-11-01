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
public class Produto {
    private int codigo;
    private String descricao;
    private int qtdeDisponivel;
    private double precoUnit;
    private int estoqueMin;

    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    public int getQtdeDisponivel() {
        return qtdeDisponivel;
    }
    
    public void setQtdeDisponivel(int qtdeDisponivel) {
        this.qtdeDisponivel = qtdeDisponivel;
    }
    
    public double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }
    
    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }  
    
    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
