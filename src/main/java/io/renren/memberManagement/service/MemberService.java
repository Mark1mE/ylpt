package io.renren.memberManagement.service;

import io.renren.memberManagement.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/29 16:27
 */
@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public Page<Object[]> getMembers(String mvId, Integer pageNum, Integer pageSize) {
        PageRequest request = new PageRequest(pageNum, pageSize, null);
        Page<Object[]> page = memberRepository.findMemberByOrders(mvId, request);
        return page;
    }
}
