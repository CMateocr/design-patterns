package com.inter;

import com.model.User;

public interface IUserRepository {

    User create(String name, String lastName);

}
