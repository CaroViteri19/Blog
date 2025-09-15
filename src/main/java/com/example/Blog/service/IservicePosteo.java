package com.example.Blog.service;

import com.example.Blog.model.Posteo;
import com.example.Blog.repository.PosteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
public interface IservicePosteo {
    List<Posteo> obtenerTodosPosteos();
    Posteo obtenerPorId(Long id);
    void guardarPosteo(Posteo posteo);

    void actualizarPosteo(Posteo posteoActualizado);

    void eliminarPosteo(Long id);
}