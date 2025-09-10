package com.example.Blog.service;
import  com.example.Blog.model.Posteo;
import com.example.Blog.repository.IposteoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PosteoService implements IservicePosteo{
    private IposteoRepository posteoRepository;


    @Override
    public List<Posteo> obtenerTodosPosteos() {
        return List.of();
    }

    @Override
    public Posteo obtenerPorId(Long id) {
        return null;
    }

    @Override
    public void guardarPosteo(Posteo posteo) {

    }
}
