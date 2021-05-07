package org.tracker.setup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.tracker.data.Task;
import org.tracker.data.TaskStatus;
import org.tracker.data.TaskType;
import org.tracker.system.TaskInsertionService;

import java.util.Arrays;
import java.util.Date;

@Controller
public class MainController {

    @Autowired
    private TaskInsertionService service;

    @GetMapping("/")
    public String display(Model model){
        model.addAttribute("task", new Task());
        model.addAttribute("types", TaskType.values());
        return "input";
    }





    @RequestMapping(value = "/tasks", method = RequestMethod.POST)
    public void insertTasks(@RequestBody Task task){
        task.setLogDate(new Date());
        if(task.getType() == null){
            task.setType(TaskType.Miscellaneous);
        }
        if(task.getStatus() == null){
            task.setStatus(TaskStatus.New);
        }

        service.insertTasks(Arrays.asList(task));
    }



}
