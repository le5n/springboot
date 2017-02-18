package com.le5n.app.controllers;

import com.le5n.app.entities.TopicEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<TopicEntity> getAllTopics() {
        return Arrays.asList(
                new TopicEntity(1, "name", "description"),
                new TopicEntity(3, "name2", "description2"),
                new TopicEntity(3, "name3", "description3")
        );
    }
}
