package com.zh.model;

public class Jyschool {
    private Integer uid;

    private Integer sid;

    private String name;

    private Integer fid;

    private String url;

    public Jyschool(Integer uid, Integer sid, String name, Integer fid, String url) {
        this.uid = uid;
        this.sid = sid;
        this.name = name;
        this.fid = fid;
        this.url = url;
    }

    public Jyschool() {
        super();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}