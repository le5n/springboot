package com.le5n.app.repositories;

import com.le5n.app.entities.TopicEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository  extends CrudRepository<TopicEntity,Integer>{
}
