package com.damnteam.LostArkToDo.repository;

import com.damnteam.LostArkToDo.model.Activity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends CrudRepository<Activity, Long> {
}
