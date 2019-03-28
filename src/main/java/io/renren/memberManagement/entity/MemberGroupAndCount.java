package io.renren.memberManagement.entity;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/24 23:17
 */
public class MemberGroupAndCount {
    private MemberGroup memberGroup;
    private int memberCount;

    public MemberGroup getMemberGroup() {
        return memberGroup;
    }

    public void setMemberGroup(MemberGroup memberGroup) {
        this.memberGroup = memberGroup;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }
}
