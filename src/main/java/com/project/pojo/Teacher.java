package com.project.pojo;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * Description
 *
 * @Author：阿牛
 * @Date：Created in 2023/9/15 13:25
 */
@Data
public class Teacher {
    private Integer tId;
    @NotBlank
    private String tName;
    @NotBlank
    private String tPassword;
    private String tPhone;
    private String tGender;

    public Teacher() {
    }

    public Teacher(Integer tId,  String tName,String tPassword, String tPhone, String tGender) {
        this.tId = tId;
        this.tName = tName;
        this.tPassword = tPassword;
        this.tPhone = tPhone;
        this.tGender = tGender;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettPhone() {
        return tPhone;
    }

    public void settPhone(String tPhone) {
        this.tPhone = tPhone;
    }

    public String gettGender() {
        return tGender;
    }

    public void settGender(String tGender) {
        this.tGender = tGender;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                ", tPassword='" + tPassword + '\'' +
                ", tPhone='" + tPhone + '\'' +
                ", tGender='" + tGender + '\'' +
                '}';
    }
}
