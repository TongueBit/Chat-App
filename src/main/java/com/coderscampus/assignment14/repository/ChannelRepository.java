package com.coderscampus.assignment14.repository;


import com.coderscampus.assignment14.domain.Channel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ChannelRepository
{
    private static List<Channel> channels = new ArrayList<>();

    public static List<Channel> getChannels() {
        if (channels.isEmpty())
            channels.add(new Channel("General"));
        else
            return channels;
        return channels;
    }

    public Channel getChannelById(Long id) {
        for (Channel channel : channels) {
            if (channel.getId() == id) {
                return channel;
            }
        }
        return null;

    }

}
