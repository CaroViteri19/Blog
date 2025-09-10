package com.example.Blog.repository;

import com.example.Blog.model.Posteo;
import java.util.List;

public interface IposteoRepository {
        List<Posteo> findAll();
        Posteo findById(Long id);
        void save(Posteo persona);
    }

