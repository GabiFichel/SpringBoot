package com.devSenai2A.cadastro.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")

public class Usuario {

@Id()
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String nome;
private String email;
private String senha;
private String perfil;
private String endereco;
private String bairro;
private String complemento;
private String cep;
private String cidade;
private String estado;
}