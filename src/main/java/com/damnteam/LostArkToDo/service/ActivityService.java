package com.damnteam.LostArkToDo.service;

import com.damnteam.LostArkToDo.model.Activity;
import com.damnteam.LostArkToDo.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository repository;

    public Activity update(Activity activity) {
        return repository.save(activity);
    }

    public Iterable<Activity> getAll() {
        return repository.findAll();
    }

    public Activity create(Activity activity) {
        return repository.save(activity);
    }
}
