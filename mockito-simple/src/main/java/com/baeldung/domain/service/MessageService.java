package com.dipu.domain.service;

import com.dipu.domain.model.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public Message deliverMessage (Message message) {

        return message;
    }
}
