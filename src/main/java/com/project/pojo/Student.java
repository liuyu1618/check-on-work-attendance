package com.project.pojo;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * Description
 * 学生实体类
 * @Author：阿牛
 * @Date：Created in 2023/9/11 10:54
 */
//@Data
public class Student {
    private Integer sId;
//    @NotBlank
    private String sName;
//    @NotBlank
    private String sPassword;
    private String sGender;
    private String sPhone;
    private String sEmail;
    private Integer cId;

    public Student() {
    }

    public Student(String sName, String sPassword, String sGender, String sPhone, String sEmail, Integer cId) {
        this.sName = sName;
        this.sPassword = sPassword;
        this.sGender = sGender;
        this.sPhone = sPhone;
        this.sEmail = sEmail;
        this.cId = cId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    public String getsGender() {
        return sGender;
    }

    public void setsGender(String sGender) {
        this.sGender = sGender;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sPassword='" + sPassword + '\'' +
                ", sGender='" + sGender + '\'' +
                ", sPhone='" + sPhone + '\'' +
                ", sEmail='" + sEmail + '\'' +
                ", cId=" + cId +
                '}';
    }
}
