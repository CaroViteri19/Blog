package com.example.Blog.service;

import com.example.Blog.model.Posteo;

import java.util.List;

public interface IservicePosteo {
    List<Posteo> obtenerTodosPosteos();
    Posteo obtenerPorId(Long id);
    void guardarPosteo(Posteo posteo);
}
