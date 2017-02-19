package com.le5n.app.service;

import com.le5n.app.entities.TopicEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
   private List<TopicEntity> topics = new ArrayList<>(Arrays.asList(
            new TopicEntity(1, "name", "description"),
                new TopicEntity(2, "name2", "description2"),
                new TopicEntity(3, "name3", "description3")));

    public List<TopicEntity> getTopics() {
        return topics;
    }

    public TopicEntity getTopicById (int id){
       return topics.stream().filter(t -> t.getId() == id).findFirst().get();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/")
    public void addTopic(@RequestBody TopicEntity topic){
        topics.add(topic);
    }
}
