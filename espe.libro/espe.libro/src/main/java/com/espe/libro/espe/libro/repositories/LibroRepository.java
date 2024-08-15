package com.espe.libro.espe.libro.repositories;

import com.espe.libro.espe.libro.models.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}

