package com.andersenlab.usertrackerspring.controller;

import com.andersenlab.usertrackerspring.entity.UserEntity;
import com.andersenlab.usertrackerspring.exception.DataAccessException;
import com.andersenlab.usertrackerspring.factory.UserRepositoryJDBCImplFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserEntityController {
    private final UserRepositoryJDBCImplFactory factory;


    @GetMapping
    public List<UserEntity> getAll(){
        return factory.getRepository().findAll();
    }

    @GetMapping("/{id:\\d+}")
    public UserEntity getById(@PathVariable long id){
        return factory.getRepository().findById(id).orElseThrow(DataAccessException::new);
    }

    @PostMapping
    public UserEntity save(@RequestBody UserEntity item)
    {
        return factory.getRepository().save(item);
    }

    @PostMapping("/{id}/remove")
    public boolean removeById(@PathVariable long id){
        return factory.getRepository().removeById(id);
    }
}
