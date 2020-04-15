package com.damnteam.LostArkToDo.controller;

import com.damnteam.LostArkToDo.model.Activity;
import com.damnteam.LostArkToDo.service.ActivityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {

    private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @GetMapping
    public Iterable<Activity> getAll() {
        return activityService.getAll();
    }

    @PostMapping
    public Activity update(Activity activity) {
        return activityService.update(activity);
    }

    @PostMapping
    public Activity create(Activity activity) {
        return activityService.create(activity);
    }
}
