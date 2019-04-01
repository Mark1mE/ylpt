package io.renren.memberManagement.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/31 23:47
 */
@Entity
@Table(name = "vip_user_group")
@Data
@EntityListeners(AuditingEntityListener.class)
public class VipUserAndGroup {
    @Id
    //会员-会员组表主键
    private String vugId;
    //用户信息表主键
    private String userInfoId;
    //VIP组表主键
    private String vgId;
    //商户表主键
    private String merchantInfoId;
    //TODO 直接存用户标签？
    //用户标签
    private String label;
    //备注
    private String remark;
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
}
