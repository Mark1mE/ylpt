package io.renren.memberManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @description: 会员组
 * @author: 么红帅
 * @date: 2019/3/24 22:31
 */
@Entity
public class MemberGroup {
    @Id
    private int memberGroupId;
    //会员分群名称
    private String memberGroupName;
    //会员分群定义
    private String memberGroupDef;

    public int getMemberGroupId() {
        return memberGroupId;
    }

    public void setMemberGroupId(int memberGroupId) {
        this.memberGroupId = memberGroupId;
    }

    public String getMemberGroupName() {
        return memberGroupName;
    }

    public void setMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
    }

    public String getMemberGroupDef() {
        return memberGroupDef;
    }

    public void setMemberGroupDef(String memberGroupDef) {
        this.memberGroupDef = memberGroupDef;
    }
}
