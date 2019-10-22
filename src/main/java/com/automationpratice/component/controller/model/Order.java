package com.automationpratice.component.controller.model;


import javax.persistence.*;

import static javax.persistence.CascadeType.ALL;


@Entity
@Table(name = "ORDER")
public class Order {

    @Column
    @OneToOne(fetch = FetchType.EAGER, cascade = ALL, targetEntity = Address.class)
    Address DeliveryAddress;
    @Column
    @OneToOne(fetch = FetchType.EAGER, cascade = ALL, targetEntity = Address.class)
    Address BillingAAddress;
    @Id
    @GeneratedValue
    @Column(name = "id_user_execution")
    private int id;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "preço")
    private double preço;
    @Column(name = "quantidade")
    private int quantidade;
    @Column(name = "total")
    private double total;


    public Address getDeliveryAddress() {
        return DeliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        DeliveryAddress = deliveryAddress;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;

    }


}
