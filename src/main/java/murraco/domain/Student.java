package murraco.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "student")
public class Student extends Conference {

    private boolean scholarship;
    private float costTravel;
    private String studentUserEmail;
    private String number;
    private String subRoad;
    private String road;
    private String district;
    private String subProvince;
    private String province;
    private String postcode;
    private String identificationNumber;
    private String phoneNumber;
    private String degree;
    private String teacherEmail;

    @OneToOne
    private StudentCourse studentCourse;

    public boolean isScholarship() {
        return scholarship;
    }

    public Student setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
        return this;
    }

    public float getCostTravel() {
        return costTravel;
    }

    public Student setCostTravel(float costTravel) {
        this.costTravel = costTravel;
        return this;
    }

    public String getStudentUserEmail() {
        return studentUserEmail;
    }

    public Student setStudentUserEmail(String studentUserEmail) {
        this.studentUserEmail = studentUserEmail;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public Student setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getSubRoad() {
        return subRoad;
    }

    public Student setSubRoad(String subRoad) {
        this.subRoad = subRoad;
        return this;
    }

    public String getRoad() {
        return road;
    }

    public Student setRoad(String road) {
        this.road = road;
        return this;
    }

    public String getDistrict() {
        return district;
    }

    public Student setDistrict(String district) {
        this.district = district;
        return this;
    }

    public String getSubProvince() {
        return subProvince;
    }

    public Student setSubProvince(String subProvince) {
        this.subProvince = subProvince;
        return this;
    }

    public String getProvince() {
        return province;
    }

    public Student setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getPostcode() {
        return postcode;
    }

    public Student setPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public Student setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Student setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getDegree() {
        return degree;
    }

    public Student setDegree(String degree) {
        this.degree = degree;
        return this;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public Student setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
        return this;
    }

    public StudentCourse getStudentCourse() {
        return studentCourse;
    }

    public Student setStudentCourse(StudentCourse studentCourse) {
        this.studentCourse = studentCourse;
        return this;
    }
}
