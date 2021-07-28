package com.victorbicego.university;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class ClassRoom {

    @Id
    @GeneratedValue
    private Long roomId;

    private String roomName;

    @OneToMany(mappedBy = "subjectRoom")
    private List<Subject> roomSubjects;
}
