package com.codingnuts.topicapi.repos;

import com.codingnuts.topicapi.entity.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
