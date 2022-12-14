package com.dipu.junit5.mockito.repository;

import com.dipu.junit5.mockito.User;

public interface UserRepository {

    User insert(User user);
    boolean isUsernameAlreadyExists(String userName);
    
}
