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

    public Student() {
    }

    public boolean isScholarship() {
        return scholarship;
    }

    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }

    public float getCostTravel() {
        return costTravel;
    }

    public void setCostTravel(float costTravel) {
        this.costTravel = costTravel;
    }

    public String getStudentUserEmail() {
        return studentUserEmail;
    }

    public void setStudentUserEmail(String studentUserEmail) {
        this.studentUserEmail = studentUserEmail;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSubRoad() {
        return subRoad;
    }

    public void setSubRoad(String subRoad) {
        this.subRoad = subRoad;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getSubProvince() {
        return subProvince;
    }

    public void setSubProvince(String subProvince) {
        this.subProvince = subProvince;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public StudentCourse getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(StudentCourse studentCourse) {
        this.studentCourse = studentCourse;
    }
}
