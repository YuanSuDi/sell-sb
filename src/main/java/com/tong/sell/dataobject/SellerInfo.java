package com.tong.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 *   卖家信息
 * @author 元素滴
 * @date 2018/6/1 11:23
 */
@Entity
@DynamicUpdate
@Data
public class SellerInfo{

    /**卖家id*/
    @Id
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


}
