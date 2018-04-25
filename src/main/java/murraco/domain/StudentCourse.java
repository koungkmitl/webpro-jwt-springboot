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

    @OneToOne(targetEntity = Student.class)
    private Student student;

    public Integer getId() {
        return id;
    }

    public StudentCourse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getCourse() {
        return course;
    }

    public StudentCourse setCourse(String course) {
        this.course = course;
        return this;
    }

    public String getMajor() {
        return major;
    }

    public StudentCourse setMajor(String major) {
        this.major = major;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public StudentCourse setDepartment(String department) {
        this.department = department;
        return this;
    }
//
//    public Student getStudent() {
//        return student;
//    }
//
//    public StudentCourse setStudent(Student student) {
//        this.student = student;
//        return this;
//    }
}
