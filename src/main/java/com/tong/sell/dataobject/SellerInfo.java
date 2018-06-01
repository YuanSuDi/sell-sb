package com.tong.sell.dataobject;

import java.io.Serializable;
import java.util.Date;

/**
 *   卖家信息
 * @author 元素滴
 * @date 2018/6/1 11:23
 */
public class SellerInfo implements Serializable {

    /**卖家id*/
    private String id;
    /**卖家用户名*/
    private String username;
    /**卖家用户密码*/
    private String password;
    /**卖家的微信openid*/
    private String openid;
    /**创建时间*/
    private Date createTime;
    /**更新时间*/
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SellerInfo{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", openid='" + openid + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
