package com.example.Blog.controller;


import com.example.Blog.model.Posteo;
import com.example.Blog.service.PosteoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posteos")
public class posteoController {
    private PosteoService posteoService;

    @Autowired
    public posteoController(PosteoService posteoService){
        this.posteoService = posteoService;
    }
    @GetMapping
    public List<Posteo> ListarPosteos(){
        return  posteoService.obtenerTodosPosteos();
    }

    @GetMapping("/{id}")
    public Posteo obtenerPorId(@PathVariable long id){
        return posteoService.obtenerPorId(id);
    }
    @PostMapping
    public ResponseEntity<String> crearPosteo(@RequestBody Posteo posteo){
        posteoService.guardarPosteo(posteo);
        return ResponseEntity.ok("posteo agrgado con exto");
    }
}
