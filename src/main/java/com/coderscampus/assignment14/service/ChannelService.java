package com.coderscampus.assignment14.service;

import com.coderscampus.assignment14.domain.Channel;
import com.coderscampus.assignment14.repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelService {

    @Autowired
    private ChannelRepository channelRepsoitory;

    public List<Channel> getChannels() {
        return channelRepsoitory.getChannels();
    }

    public Channel getChannel(Long id) {
        return channelRepsoitory.getChannelById(id);
    }
}
