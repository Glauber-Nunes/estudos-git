package com.example.demo.enums;


public enum StatusCliente {

    ATIVO_CLIENTE("Cliente ativo"),
    INATIVO_CLIENTE("Cliente Inativo"),
    SUSPENSO_CLIENTE("Cliente Suspenso");

    private final String descricao;

    StatusCliente(String descricao) {
        this.descricao = descricao;
    }
}
