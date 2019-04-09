package io.renren.modules.memberManagement.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @description: 会员表 根据3.10部分创建
 * @author: 么红帅
 * @date: 2019/3/24 21:49
 */

@Entity
@Table(name = "tb_member")
@Data
public class Member {
    @Id
    private Long memberId;
    //会员积分
    private int integral;
    //会员代币
    private int token;
    //会员身份
    private String identity;
    //会员等级id
    private int memberClassId;
    //用户信息表id
    private String userInfoId;
    //所属会员分群id
    private int memberGroupId;
}
