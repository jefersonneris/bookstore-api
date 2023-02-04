package com.devneutro.bookstore.repositories;

import com.devneutro.bookstore.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
}
