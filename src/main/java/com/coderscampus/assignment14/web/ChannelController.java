package com.coderscampus.assignment14.web;

import com.coderscampus.assignment14.domain.Channel;
import com.coderscampus.assignment14.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ChannelController {

    @Autowired
    ChannelService channelService;

    @GetMapping("/")
    public String channels(ModelMap model) {
        return "redirect:/welcome";
    }

    @GetMapping("/welcome")
    public String welcome(ModelMap model) {
        List<Channel> channels = channelService.getChannels();
        model.put("channels",  channels);
        return "welcome";
    }

    @GetMapping("/channels/{id}/load")
    @ResponseBody
    public Channel reloadChannel(ModelMap model, @PathVariable String id) {
        Channel channel = channelService.getChannel(Long.valueOf(id));
        return channel;
    }

    @GetMapping("/channels/{id}")
    public String getChannel(ModelMap model, @PathVariable String id) {
        Channel channel = channelService.getChannel(Long.valueOf(id));
        model.put("channel", channel);
        return "channel";
    }



}
