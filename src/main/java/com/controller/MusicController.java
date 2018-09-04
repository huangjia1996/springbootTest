package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.service.MusicService;

import javax.annotation.Resource;

@Controller
public class MusicController {

    @Resource
    private MusicService musicService;


    @RequestMapping("/index.html")
    public ModelAndView getMusics(ModelAndView model){
        System.out.println("11111");
        model.setViewName("/test");
        model.addObject("key",musicService.getMusics());
        return model;
    }

}
