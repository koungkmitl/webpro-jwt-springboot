package murraco.dto;

public class StudentDto {

    private int id;
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
    private int studentCourse;                // setter

    public int getId() {
        return id;
    }

    public StudentDto setId(int id) {
        this.id = id;
        return this;
    }

    public boolean isScholarship() {
        return scholarship;
    }

    public StudentDto setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
        return this;
    }

    public float getCostTravel() {
        return costTravel;
    }

    public StudentDto setCostTravel(float costTravel) {
        this.costTravel = costTravel;
        return this;
    }

    public String getStudentUserEmail() {
        return studentUserEmail;
    }

    public StudentDto setStudentUserEmail(String studentUserEmail) {
        this.studentUserEmail = studentUserEmail;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public StudentDto setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getSubRoad() {
        return subRoad;
    }

    public StudentDto setSubRoad(String subRoad) {
        this.subRoad = subRoad;
        return this;
    }

    public String getRoad() {
        return road;
    }

    public StudentDto setRoad(String road) {
        this.road = road;
        return this;
    }

    public String getDistrict() {
        return district;
    }

    public StudentDto setDistrict(String district) {
        this.district = district;
        return this;
    }

    public String getSubProvince() {
        return subProvince;
    }

    public StudentDto setSubProvince(String subProvince) {
        this.subProvince = subProvince;
        return this;
    }

    public String getProvince() {
        return province;
    }

    public StudentDto setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getPostcode() {
        return postcode;
    }

    public StudentDto setPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public StudentDto setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public StudentDto setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getDegree() {
        return degree;
    }

    public StudentDto setDegree(String degree) {
        this.degree = degree;
        return this;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public StudentDto setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
        return this;
    }

    public int getStudentCourse() {
        return studentCourse;
    }

    public StudentDto setStudentCourse(int studentCourse) {
        this.studentCourse = studentCourse;
        return this;
    }
}
