package com.anjali.chatapp.model;

import com.anjali.chatapp.service.MessageService;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Entity
    public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   // @ManyToOne
   // @JoinColumn(name = "sender_id")
    private String sender;

   // @ManyToOne
  //  @JoinColumn(name = "recipient_id")
    private String recipient;

   // @Column(columnDefinition = "TEXT")
    private String content;
    }


