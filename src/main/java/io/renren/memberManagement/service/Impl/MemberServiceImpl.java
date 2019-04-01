package io.renren.memberManagement.service.Impl;

import io.renren.memberManagement.dao.MemberDao;
import io.renren.memberManagement.service.MemberService;
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
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberDao memberDao;

    public Page<Object[]> getMembers(String mcId, Integer pageNum, Integer pageSize) {
        PageRequest request = new PageRequest(pageNum, pageSize, null);
        Page<Object[]> page = memberDao.findMemberByOrders(mcId, request);
        return page;
    }
}
