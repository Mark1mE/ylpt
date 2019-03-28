package io.renren.memberManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @description: 会员表
 * @author: 么红帅
 * @date: 2019/3/24 21:49
 */

@Entity
public class Member {
    @Id
    private int memberId;
    //会员积分
    private int integral;
    //会员代币
    private int token;
    //会员身份
    private String identity;
    //会员等级id
    private int memberClassId;
    //用户id
    private int userId;
    //所属会员分群id
    private int memberGroupId;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public Integer getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public int getMemberClassId() {
        return memberClassId;
    }

    public void setMemberClassId(int memberClassId) {
        this.memberClassId = memberClassId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMemberGroupId() {
        return memberGroupId;
    }

    public void setMemberGroupId(int memberGroupId) {
        this.memberGroupId = memberGroupId;
    }
}
