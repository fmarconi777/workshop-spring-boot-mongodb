package com.workshop.workshopspringbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.workshop.workshopspringbootmongodb.domain.user.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
