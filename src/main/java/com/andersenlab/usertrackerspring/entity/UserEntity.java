package com.andersenlab.usertrackerspring.entity;

import lombok.Value;

@Value
public class UserEntity {
    private long id;
    private String nickName;
    private String fullName;
    private String email;
    private boolean removed = false;
}
