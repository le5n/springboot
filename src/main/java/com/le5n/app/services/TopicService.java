package com.le5n.app.services;

import com.le5n.app.entities.TopicEntity;
import com.le5n.app.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private List<TopicEntity> topics = new ArrayList<>(Arrays.asList(
            new TopicEntity(1, "name", "description"),
            new TopicEntity(2, "name2", "description2"),
            new TopicEntity(3, "name3", "description3")));

    public List<TopicEntity> getTopics() {
        List<TopicEntity> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public TopicEntity getTopicById(int id) {
        return topicRepository.findOne(id);
//        return topics.stream().filter(t -> t.getId() == id).findFirst().get();
    }

    public void addTopic(TopicEntity topicEntity) {
        topicRepository.save(topicEntity);
    }

    public void updateTopic(int id, TopicEntity topic) {
        topicRepository.save(topic);
    }

    public void deleteTopicById(int id) {
//        topics.removeIf(t -> t.getId() == id);
        topicRepository.delete(id);
    }
}
