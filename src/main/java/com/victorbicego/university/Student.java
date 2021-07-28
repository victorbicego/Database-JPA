package com.victorbicego.university;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long studentId;

    private String studentName;

    @ManyToMany
    private List<Subject> studentSubjects;

    @OneToMany(mappedBy = "gradeStudent")
    private List<Grade> studentGrades;

}
