package io.renren.modules.orderManagement.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @description: 普通用户信息表
 * @author: 么红帅
 * @date: 2019/3/28 16:34
 */
@Entity
@Table(name = "tb_customer_user_info")
@Data
public class CustomerUserInfo {
    @Id
    //用户id
    private Long customerInfoId;
    //用户信息表主键
    private String userInfoId;
    //用户名
    private String userName;
    //手机号码
    private String userMobile;
    //登录密码
    private String userPwd;
    //性别(0-男性；1-女性；2-保密)
    private Byte userGender;
    //用户年龄
    private int userAge;
    //证件类型
    private String certificateType;
    //证件号码
    private String certificateNum;
    //民族
    private String nation;
    //社保类型（social security）
    private String ssType;
    //身高（cm单位）
    private int height;
    //体重（kg单位）
    private int weight;
    //头像存储地址
    private String userPhoto;
    //注册时间
    private Date createTime;
    //所属地区(到市级)
    private String area;
    //默认收货地址  TODO 类型和用户地址表主键类型不一致
    private Long addressId;
    //国家
    private String country;
    //省份
    private String province;
    //城市
    private String city;
    //县区
    private String district;
    //备用字段
    private String field1;
    //备用字段
    private String field2;
    //备用字段
    private String field3;
}
