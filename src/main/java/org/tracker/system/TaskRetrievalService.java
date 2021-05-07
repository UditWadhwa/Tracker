package org.tracker.system;

import org.mongodb.morphia.Datastore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tracker.data.Task;
import org.tracker.data.TaskType;

import java.util.List;

@Component
public class TaskRetrievalService {

    private Datastore datastore;

    @Autowired
    public TaskRetrievalService(Datastore datastore){
        this.datastore = datastore;
    }


    public List<Task> getTaskFilterByType(TaskType taskType){

        //datastore.createQuery(Task.class).filter()

    }

}
