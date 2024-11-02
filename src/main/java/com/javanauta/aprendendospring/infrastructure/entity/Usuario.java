package com.javanauta.aprendendospring.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name = "usuario")
    public class Usuario {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long Id;

     @Column(name = "nome", length = 100)
     private String nome;

     @Column(name = "email", length = 100)
     private String email;

     @Column(name = "senha", length = 10)
     private String senha;

     @OneToMany(cascade = CascadeType.ALL)
     //nome da coluna de endereco que se refere ao usuario
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
     private List<Endereco>enderecos;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private List<Telefone> telefones;
        }


