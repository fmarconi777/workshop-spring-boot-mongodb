package com.workshop.workshopspringbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.workshop.workshopspringbootmongodb.domain.post.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
