package com.victorbicego.university;

import javax.persistence.*;
import java.util.List;

@Entity
public class Professor {

    @Id
    @GeneratedValue
    private Long professorId;

    private String professorName;

    @OneToMany(mappedBy = "subjectProfessor")
    private List<Subject> professorSubjects;

}
