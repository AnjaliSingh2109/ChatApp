package com.anjali.chatapp.service;

import com.anjali.chatapp.Repository.MessageRepository;
import com.anjali.chatapp.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }
}
