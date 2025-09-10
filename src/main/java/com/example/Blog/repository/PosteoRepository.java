package com.example.Blog.repository;
import com.example.Blog.model.Posteo;
import  org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PosteoRepository implements IposteoRepository{
    private List<Posteo> posteos = new ArrayList<>();

    public PosteoRepository (){
        posteos.add(new Posteo(1l,"posteo1","Samuel"));
        posteos.add(new Posteo(2l,"posteo2","Carlos"));

    }

    @Override
    public List<Posteo> findAll() {
        return posteos;
    }

    @Override
    public Posteo findById(Long id) {
        for(Posteo posteo: posteos){
            if (posteo.getId().equals(id)) {
                return posteo;
            }
        }
        return null;
    }

    @Override
    public void save(Posteo posteo) {
        posteos.add(posteo);

    }
}
