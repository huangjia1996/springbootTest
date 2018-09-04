package com.service.impl;


import com.dao.MusicMapper;
import com.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pojo.Music;

import javax.annotation.Resource;
import java.util.List;
@Service("MusicService")
public class MusicServiceImpl implements MusicService {

    @Resource
    private MusicMapper musicMapper;

    @Override
    public List<Music> getMusics() {
        return musicMapper.getMusics();
    }
}
