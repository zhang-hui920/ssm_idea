package com.zh.model;

public class Jystudent {
    private Integer sid;

    private Integer cid;

    private String sname;

    private String sex;

    private Integer sage;

    private String school;

    private String profession;

    private String grade;

    public Jystudent(Integer sid, Integer cid, String sname, String sex, Integer sage, String school, String profession, String grade) {
        this.sid = sid;
        this.cid = cid;
        this.sname = sname;
        this.sex = sex;
        this.sage = sage;
        this.school = school;
        this.profession = profession;
        this.grade = grade;
    }

    public Jystudent() {
        super();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}