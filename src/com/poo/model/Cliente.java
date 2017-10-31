package com.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Airton Brasil 0030481611002
 * @author Allan Flores 0030481611001
 * @author Caique Siqueira 0030481611009
 */
public class Cliente extends Pessoa {
    private double limiteCred;
    private double limiteDisp;
    /* IMPLEMENTAR QUANDO CLASSE Pedido FOR CRIADA
    private ArrayList<Pedido> pedidos;
    */

    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        limiteDisp = limiteCred;
        /* IMPLEMENTAR QUANDO CLASSE Pedido FOR CRIADA
        pedidos = new ArrayList<Pedido>();
        */
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }
    
    /* IMPLEMENTAR QUANDO CLASSE Pedido FOR CRIADA
    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
        pedido.setCliente(this);
    }
    */
}
