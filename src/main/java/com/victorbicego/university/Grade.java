package com.victorbicego.university;

import javax.persistence.*;

@Entity
public class Grade {

    @Id
    @GeneratedValue
    private Long gradeId;

    private Double gradeValue;

    @ManyToOne
    private Student gradeStudent;

    @ManyToOne
    private Subject gradeSubject;

}
