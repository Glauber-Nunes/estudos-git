package com.example.demo.entity;

import com.example.demo.enums.StatusCliente;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String telefone;

    private StatusCliente status;

    private LocalDate dataCadastro = LocalDate.now();
}
