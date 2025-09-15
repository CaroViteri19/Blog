package com.example.Blog.repository;


import com.example.Blog.model.Posteo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosteoRepository extends JpaRepository<Posteo, Long> {
    // No necesitas declarar nada adicional para CRUD básico
}


