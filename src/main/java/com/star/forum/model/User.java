package com.star.forum.model;

public class User {

    private Long id;

    private String accountId;

    private String qqAccountId;

    private String baiduAccountId;

    private String weiboAccountId;

    private String name;

    private String token;

    private Long gmtCreate;

    private Long gmtModified;

    private String avatarUrl;

    private String email;

    private String phone;

    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getQqAccountId() {
        return qqAccountId;
    }

    public void setQqAccountId(String qqAccountId) {
        this.qqAccountId = qqAccountId == null ? null : qqAccountId.trim();
    }

    public String getBaiduAccountId() {
        return baiduAccountId;
    }

    public void setBaiduAccountId(String baiduAccountId) {
        this.baiduAccountId = baiduAccountId == null ? null : baiduAccountId.trim();
    }

    public String getWeiboAccountId() {
        return weiboAccountId;
    }

    public void setWeiboAccountId(String weiboAccountId) {
        this.weiboAccountId = weiboAccountId == null ? null : weiboAccountId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}