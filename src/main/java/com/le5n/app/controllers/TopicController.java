package com.le5n.app.controllers;

import com.le5n.app.entities.TopicEntity;
import com.le5n.app.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<TopicEntity> getAllTopics() {
     return topicService.getTopics();
    }

    @RequestMapping("/topics/{id}")
    public TopicEntity getTopicById (@PathVariable int id){
        return topicService.getTopicById(id);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/")
    public void addTopic(@RequestBody TopicEntity topic){
        topicService.addTopic(topic);
    }
}
