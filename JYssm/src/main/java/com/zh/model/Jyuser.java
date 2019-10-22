package com.zh.model;

public class Jyuser {
    private String uid;

    private String uname;

    private String upwd;

    private String salt;

    private String sex;

    private Integer utype;

    private Integer ustatus;

    private String email;

    private String birthday;

    private String question;

    private String profession;

    private String school;

    private String education;

    private String identity;

    private String subject;

    private String cintention;

    private String phone;

    private String address;

    public Jyuser(String uid, String uname, String upwd, String salt, String sex, Integer utype, Integer ustatus, String email, String birthday, String question, String profession, String school, String education, String identity, String subject, String cintention, String phone, String address) {
        this.uid = uid;
        this.uname = uname;
        this.upwd = upwd;
        this.salt = salt;
        this.sex = sex;
        this.utype = utype;
        this.ustatus = ustatus;
        this.email = email;
        this.birthday = birthday;
        this.question = question;
        this.profession = profession;
        this.school = school;
        this.education = education;
        this.identity = identity;
        this.subject = subject;
        this.cintention = cintention;
        this.phone = phone;
        this.address = address;
    }

    public Jyuser() {
        super();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getUtype() {
        return utype;
    }

    public void setUtype(Integer utype) {
        this.utype = utype;
    }

    public Integer getUstatus() {
        return ustatus;
    }

    public void setUstatus(Integer ustatus) {
        this.ustatus = ustatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCintention() {
        return cintention;
    }

    public void setCintention(String cintention) {
        this.cintention = cintention;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}