package murraco.domain;

import murraco.domain_enum.State;

import javax.persistence.*;

@Entity
public class Student extends Conference{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String testStudent;
//    private boolean schoarship;
//    private float costTravel;
//    private String studentUserEmail;
//    private String number;
//    private String subRoad;
//    private String road;
//    private String district;
//    private String subProvince;
//    private String province;
//    private String postcode;
//    private String identificationNumber;
//    private String phoneNumber;
//    private String degree;
//    private String teacherEmail;
//    @Enumerated(EnumType.STRING)
//    private State state;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "conference_id")
//    private Conference conference;

    @OneToOne
    @JoinColumn(name = "student_course_id")
    private StudentCourse studentCourse;
}
