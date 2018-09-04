package com.dao;


import org.springframework.stereotype.Repository;
import com.pojo.Music;

import java.util.List;

@Repository
public interface MusicMapper   {
    List<Music> getMusics();
}
