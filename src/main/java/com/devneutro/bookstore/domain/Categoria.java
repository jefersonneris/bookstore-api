package com.devneutro.bookstore.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Categoria {
    private Long id;
    private String nome;
    private String descricao;
    private List<Livro> livros = new ArrayList<>();
}
