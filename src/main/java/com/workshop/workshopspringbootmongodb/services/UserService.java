package com.workshop.workshopspringbootmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.workshopspringbootmongodb.domain.user.User;
import com.workshop.workshopspringbootmongodb.dto.UserDTO;
import com.workshop.workshopspringbootmongodb.repository.UserRepository;
import com.workshop.workshopspringbootmongodb.services.exception.ObjectNotFoundException;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        Optional<User> user = repository.findById(id);
        if (!user.isPresent()) {
            throw new ObjectNotFoundException("Object not found");
        }
        return user.get();
        
        // Outra solução para o findById
        // return user.orElseThrow(() -> new ObjectNotFoundException("Object not found")); //NOSONAR
    }

    public User insert(User obj) {
        return repository.insert(obj);
    }

    public void delete(String id) {
        findById(id);
        repository.deleteById(id);
    }

    public User update(User obj) {
        User newObjUser = repository.findById(obj.getId()).get();
        updateData(newObjUser, obj);
        return repository.save(newObjUser);
    }

    private void updateData(User newObjUser, User obj) {
        newObjUser.setName(obj.getName());
        newObjUser.setEmail(obj.getEmail());
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.id(), objDto.name(), objDto.email());
    }
}
