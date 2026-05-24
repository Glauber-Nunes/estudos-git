package com.example.demo.controller;

import com.example.demo.dto.request.ClienteRequest;
import com.example.demo.entity.Cliente;
import com.example.demo.enums.StatusCliente;
import com.example.demo.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteRepository clienteRepository;

    @PostMapping
    public ResponseEntity<Cliente> create(ClienteRequest clienteRequest) {

        Cliente clienteSalvo = Cliente.builder()
                .nome(clienteRequest.getNome())
                .email(clienteRequest.getEmail())
                .telefone(clienteRequest.getTelefone())
                .status(StatusCliente.ATIVO_CLIENTE)
                .dataCadastro(LocalDate.now())
                .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(clienteSalvo));
    }

    @GetMapping
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }
}
