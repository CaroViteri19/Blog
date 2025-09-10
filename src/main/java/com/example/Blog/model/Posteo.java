package com.example.Blog.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.beans.ConstructorProperties;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Posteo {
    private long  id;
    private String titulo;
    private String autor;

}
