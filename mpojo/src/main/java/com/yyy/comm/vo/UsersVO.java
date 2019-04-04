package com.yyy.comm.vo;



public class UsersVO {
    
    private String id;
	
	private String token;
	
    /**
     * 用户名
     */
    private String loginName;


    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
}