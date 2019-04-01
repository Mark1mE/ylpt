package io.renren.memberManagement.entity;

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
 * @description:
 * @author: 么红帅
 * @date: 2019/3/31 23:37
 */
@Entity
@Table(name = "vip_group")
@Data
@EntityListeners(AuditingEntityListener.class)
public class VipGroup {
    @Id
    //VIP组表主键
    private String vgId;
    //组名称
    private String groupName;
    //商户表主键
    private String merchantInfoId;
    //人群定义
    private String remark;
    //成员数
    private int memberNum;
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
