package com.le5n.app.controllers;

import com.le5n.app.entities.TopicEntity;
import com.le5n.app.services.TopicService;
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

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody TopicEntity topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody TopicEntity topic, @PathVariable int id){
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic (@PathVariable int id){
        topicService.deleteTopicById(id);
    }
}
