package com.devneutro.bookstore.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class Livro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String nomeAutor;
    private String texto;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
