package com.impl;

import com.inter.IUserRepository;
import com.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {

    @Override
    public User create(String name, String lastName) {
        return new User(name, lastName);
    }
}
