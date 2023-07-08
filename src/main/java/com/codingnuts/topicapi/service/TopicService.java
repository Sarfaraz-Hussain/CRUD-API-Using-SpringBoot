package com.codingnuts.topicapi.service;

import com.codingnuts.topicapi.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Python", "Django Framework", "Django Framework Description"),
            new Topic("JavaScript", "React Library", "React Library Description")
    ));


    public void createTopic(Topic topic) {
        topics.add(topic);
    }

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopicById(String id) {
        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void updateTopic(Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            if(topics.get(i).getId().equals(topic.getId())){
                topics.remove(i);
                topics.add(topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(topic -> topic.getId().equals(id));
    }
}
