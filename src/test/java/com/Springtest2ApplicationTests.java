package com;

import com.pojo.Music;
import com.service.MusicService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springtest2ApplicationTests {

    @Resource
    private MusicService musicService;


    @Test
    public void contextLoads() {

        for (Music m: musicService.getMusics()
             ) {
            System.out.println(m.getId()+"   "+m.getMusicName());
        }
    }

}
