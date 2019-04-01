package io.renren.orderManagement.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @description: 收货地址表
 * @author: 么红帅
 * @date: 2019/3/26 17:04
 */
@Entity
@Table(name = "user_address")
@Data
@EntityListeners(AuditingEntityListener.class)
public class UserAddress {
    @Id
    //用户收货地址表id
    private String uaId;
    //用户信息表主键
    private String userInfoId;
    //国家
    private String country;
    //省份
    private String province;
    //城市
    private String city;
    //县区
    private String district;
    //乡镇
    private String town;
    //详细地址
    private String addressDetail;
    //邮政编码
    private String zipcode;
    //收货人地址
    private String receiverName;
    //收货人电话
    private String receiverPhone;
    //收货人性别
    private int receiverSex;
    //调用的地图插件的坐标数据
    private String mapApiStr;
    //排序号
    private int addressOrder;
    //使用次数
    private int useNum;
    //创建时间
    @CreatedDate
    private Date createTime;
    //创建用户id
    private String createUser;
    //修改时间
    @LastModifiedDate
    private Date updateTime;
    //修改用户id
    private String updateUser;
    //是否是默认地址(1-默认地址/2-非默认)
    private int isDefault;
}
