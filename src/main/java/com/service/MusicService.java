package com.service;

import org.springframework.stereotype.Service;
import com.pojo.Music;

import java.util.List;

@Service
public interface MusicService {



    public List<Music> getMusics();

}
