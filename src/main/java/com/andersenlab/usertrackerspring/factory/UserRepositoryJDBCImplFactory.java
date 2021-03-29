package com.andersenlab.usertrackerspring.factory;

import com.andersenlab.usertrackerspring.repository.UserRepository;
import com.andersenlab.usertrackerspring.repository.UserRepositoryJDBCPostgresImpl;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryJDBCImplFactory implements UserRepositoryFactory {

    @Override
    public UserRepository getRepository() {
        return new UserRepositoryJDBCPostgresImpl();
    }
}
