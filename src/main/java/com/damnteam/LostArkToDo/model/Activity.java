package com.damnteam.LostArkToDo.model;

import com.damnteam.LostArkToDo.constants.ResetType;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.DayOfWeek;

@Entity
@Data
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String name;

    private ResetType resetType = ResetType.DAILY;

    private DayOfWeek resetsOn = DayOfWeek.WEDNESDAY;

    private Integer attempts = 1;

    private Integer completedTimes = 0;
}
