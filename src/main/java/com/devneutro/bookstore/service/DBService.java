package com.devneutro.bookstore.service;

import com.devneutro.bookstore.domain.Categoria;
import com.devneutro.bookstore.domain.Livro;
import com.devneutro.bookstore.repositories.CategoriaRepository;
import com.devneutro.bookstore.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;

    public void instanciaBaseDeDados(){
        Categoria cat1 = new Categoria(null, "Informatica", "Livros de TI");
        Categoria cat2 = new Categoria(null, "Saude", "Livros de Saude");
        Categoria cat3 = new Categoria(null, "Lazer", "Livros de Lazer");

        Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Lorem ipsum", cat1);
        Livro l2 = new Livro(null, "Clean Code", "Robert Martin", "Lorem ipsum", cat1);
        Livro l3 = new Livro(null, "Coração", "Santos Silva", "Lorem ipsum", cat2);
        Livro l4 = new Livro(null, "Coração", "Santos Silva", "Lorem ipsum", cat2);
        Livro l5 = new Livro(null, "Festa", "Andrade Neto", "Lorem ipsum", cat3);
        Livro l6 = new Livro(null, "Festa", "Andrade Neto", "Lorem ipsum", cat3);

        cat1.getLivros().addAll(Arrays.asList(l1, l2));
        cat2.getLivros().addAll(Arrays.asList(l3, l4));
        cat3.getLivros().addAll(Arrays.asList(l5, l6));

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5, l6));

    }

}
