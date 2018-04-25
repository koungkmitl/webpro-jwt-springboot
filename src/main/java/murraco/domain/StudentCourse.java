package murraco.domain;

import javax.persistence.*;

@Entity
public class StudentCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String course;
    private String major;
    private String department;

    @OneToOne(mappedBy = "studentCourse")
    private Student student;
}
