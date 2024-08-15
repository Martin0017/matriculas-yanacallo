package com.espe.libro.espe.libro.services;

import com.espe.libro.espe.libro.models.entity.Libro;
import com.espe.libro.espe.libro.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public Libro addLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public Optional<Libro> getLibro(Long id) {
        return libroRepository.findById(id);
    }

    public List<Libro> getAllLibros() {
        return libroRepository.findAll();
    }

    public Libro updateLibro(Long id, Libro libroDetails) {
        Libro libro = libroRepository.findById(id).orElseThrow();
        libro.setTitulo(libroDetails.getTitulo());
        libro.setAutor(libroDetails.getAutor());
        libro.setGenero(libroDetails.getGenero());
        libro.setFechaPublicacion(libroDetails.getFechaPublicacion());
        return libroRepository.save(libro);
    }

    public void deleteLibro(Long id) {
        libroRepository.deleteById(id);
    }
}

