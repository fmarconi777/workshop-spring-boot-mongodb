package com.workshop.workshopspringbootmongodb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.workshopspringbootmongodb.domain.post.Post;
import com.workshop.workshopspringbootmongodb.repository.PostRepository;
import com.workshop.workshopspringbootmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {
    
    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> post = repository.findById(id);        
        return post.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }
}
