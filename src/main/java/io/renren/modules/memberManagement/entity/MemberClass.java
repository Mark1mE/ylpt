package io.renren.modules.memberManagement.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/4/1 21:46
 */
@Entity
@Table(name = "tb_member_class")
@Data
public class MemberClass {
    @Id
    //会员等级id
    private String memberClassId;
    //会员等级名称
    private String memberClassName;
    //备用字段
    private String field1;
    //备用字段
    private String field2;
    //备用字段
    private String field3;
}
