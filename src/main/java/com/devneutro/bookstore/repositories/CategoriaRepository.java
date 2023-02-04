package com.devneutro.bookstore.repositories;

import com.devneutro.bookstore.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
