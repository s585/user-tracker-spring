package com.andersenlab.usertrackerspring.repository;

import com.andersenlab.usertrackerspring.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository <UserEntity, Long>{
    boolean existsByLogin(String login);

    List<UserEntity> findAllOrderedBy(String arg);

    Optional<UserEntity> findByNick(String login);
}
