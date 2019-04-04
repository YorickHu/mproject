package com.yyy.comm;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author yyy
 * @since 2019-03-31
 */
@TableName("users")/*notes：@tableName("user"),它是指定与数据库表的关联,这里的注解意味着你的数据库里应该有一个名为user的表与之对应*/
public class Users extends Model<Users> {

    private static final long serialVersionUID = 1L;

    /*nots：@TableField(exist = false)对于User类中有而user表中没有的属性需要加第二个注解@TableField(exist = false),表示排除User类中的属性.*/


    private String id;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 证件名
     */
    private String certName;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 系统人员编号
     */
    private String sysNo;

    /**
     * 证件号
     */
    private String certNo;

    /**
     * 创建时间
     */
    private String crtTime;

    /**
     * 更新时间
     */
    private String updTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSysNo() {
        return sysNo;
    }

    public void setSysNo(String sysNo) {
        this.sysNo = sysNo;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(String crtTime) {
        this.crtTime = crtTime;
    }

    public String getUpdTime() {
        return updTime;
    }

    public void setUpdTime(String updTime) {
        this.updTime = updTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Users{" +
        "id=" + id +
        ", loginName=" + loginName +
        ", nickName=" + nickName +
        ", certName=" + certName +
        ", pwd=" + pwd +
        ", sysNo=" + sysNo +
        ", certNo=" + certNo +
        ", crtTime=" + crtTime +
        ", updTime=" + updTime +
        "}";
    }
}
