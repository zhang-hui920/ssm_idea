package com.zh.model;

public class Jymenu {
    private Integer mid;

    private Integer did;

    private String name;

    private Integer fid;

    private String url;

    public Jymenu(Integer mid, Integer did, String name, Integer fid, String url) {
        this.mid = mid;
        this.did = did;
        this.name = name;
        this.fid = fid;
        this.url = url;
    }

    public Jymenu() {
        super();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
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