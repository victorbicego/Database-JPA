package com.victorbicego.university;

import javax.persistence.*;
import java.util.List;

@Entity
public class Subject {

    @Id
    @GeneratedValue
    private Long subjectId;

    private String subjectName;

    @ManyToOne
    private ClassRoom subjectRoom;

    @ManyToOne
    private Professor subjectProfessor;

    @ManyToMany(mappedBy = "studentSubjects")
    private List<Student> subjectStudents;
}
