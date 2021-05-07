package org.tracker.system;

import org.mongodb.morphia.Datastore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tracker.data.Task;

import java.util.List;

@Component
public class TaskInsertionService {

    private Datastore datastore;

    @Autowired
    public TaskInsertionService(Datastore datastore){
        this.datastore = datastore;
    }


    public void insertTasks(List<Task> tasks){
        datastore.save(tasks);
    }

}
