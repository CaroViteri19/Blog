package com.example.Blog.service;

import com.example.Blog.model.Posteo;
import com.example.Blog.repository.PosteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PosteoService implements IservicePosteo {

    private final PosteoRepository posteoRepository;

    @Autowired
    public PosteoService(PosteoRepository posteoRepository) {
        this.posteoRepository = posteoRepository;
    }

    @Override
    public List<Posteo> obtenerTodosPosteos() {
        return posteoRepository.findAll();
    }

    @Override
    public Posteo obtenerPorId(Long id) {
        return posteoRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarPosteo(Posteo posteo) {
        posteoRepository.save(posteo);
    }
    @Override
    public void actualizarPosteo(Posteo posteoActualizado) {
        Posteo existente = posteoRepository.findById(posteoActualizado.getId())
                .orElseThrow(() -> new RuntimeException("Posteo no encontrado con ID: " + posteoActualizado.getId()));

        existente.setTitulo(posteoActualizado.getTitulo());
        existente.setAutor(posteoActualizado.getAutor());

        posteoRepository.save(existente);
    }
    @Override
    public void eliminarPosteo(Long id) {
        if (!posteoRepository.existsById(id)) {
            throw new RuntimeException("No se puede eliminar: posteo con ID " + id + " no existe");
        }
        posteoRepository.deleteById(id);
    }


}

