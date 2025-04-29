package com.example.bibliotecaduoc.services;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.repository.LibroRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros() {
        return libroRepository.obtenerLibros();
    }

    public Libro saveLibro(Libro lib) {
        return libroRepository.guardar(lib);
    }

    public Libro getLibroId(int id) {
        return libroRepository.buscarPorId(id);
    }

    public Libro uptdateLibro(Libro lib) {
        return libroRepository.actualizar(lib);
    }

    public String deleteLibro(int id) {
        libroRepository.eliminar(id);
        return "Libro eliminado";
    }

    public Libro getLibroIsbn(String isbn) {
        return libroRepository.buscarPorIsbn(isbn);
    }

    public int totalLibros() {
        return libroRepository.obtenerLibros().size();
    }

    public int totalLibrosV2() {
        return libroRepository.totalLibros();
    }
}
