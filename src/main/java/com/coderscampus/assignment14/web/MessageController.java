package com.coderscampus.assignment14.web;

import com.coderscampus.assignment14.domain.Message;
import com.coderscampus.assignment14.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("/channels/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void postMessage(@RequestBody Message message, @PathVariable String id) {
        messageService.save(message, Long.valueOf(id));
    }


}
