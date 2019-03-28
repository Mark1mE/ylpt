package io.renren.memberManagement.service;

import io.renren.memberManagement.entity.MemberGroup;
import io.renren.memberManagement.entity.MemberGroupAndCount;
import io.renren.memberManagement.repository.MemberGroupRepository;
import io.renren.memberManagement.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/24 23:40
 */
@Service
public class MemberGroupService {
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MemberGroupRepository memberGroupRepository;

    public List<MemberGroupAndCount> getMemberGroupAndCount() {
        List<MemberGroupAndCount> groupAndCount = new ArrayList<>();
        List<MemberGroup> memberGroupList = memberGroupRepository.findAll();
        for(MemberGroup memberGroup : memberGroupList) {
            int groupId = memberGroup.getMemberGroupId();
            int count = memberRepository.countByMemberGroupId(groupId);
            MemberGroupAndCount memberGroupAndCount = new MemberGroupAndCount();
            memberGroupAndCount.setMemberGroup(memberGroup);
            memberGroupAndCount.setMemberCount(count);
            groupAndCount.add(memberGroupAndCount);
        }
        return groupAndCount;
    }
}
