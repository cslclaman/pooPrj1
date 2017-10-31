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
public class Vendedor extends Pessoa{
    private double salarioBase;
    private double comissa;

    public Vendedor(double salarioBase, String cpf, String nome) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissa() {
        return comissa;
    }

    public void setComissa(double comissa) {
        this.comissa = comissa;
    }
    
    
}
