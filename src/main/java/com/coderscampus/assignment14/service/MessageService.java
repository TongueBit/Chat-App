package com.coderscampus.assignment14.service;

import com.coderscampus.assignment14.domain.Channel;
import com.coderscampus.assignment14.domain.Message;
import com.coderscampus.assignment14.repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private ChannelRepository channelRepository;
    public Channel save(Message message, Long id) {
        Channel channel = channelRepository.getChannelById(id);
        channel.addMessage(message);
        return channel;
    }

}
