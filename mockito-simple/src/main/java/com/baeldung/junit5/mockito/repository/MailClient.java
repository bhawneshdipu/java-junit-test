package com.dipu.junit5.mockito.repository;

import com.dipu.junit5.mockito.User;

public interface MailClient {

    void sendUserRegistrationMail(User user);
    
}
