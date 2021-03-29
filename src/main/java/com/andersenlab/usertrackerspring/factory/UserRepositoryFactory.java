package com.andersenlab.usertrackerspring.factory;

import com.andersenlab.usertrackerspring.repository.UserRepository;

interface UserRepositoryFactory {
    UserRepository getRepository();
}
