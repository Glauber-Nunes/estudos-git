package com.example.demo.dto.request;


import com.example.demo.enums.StatusCliente;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ClienteRequest {

    private String nome;

    private String email;

    private String telefone;

    private StatusCliente status;
}
