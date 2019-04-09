package io.renren.modules.memberManagement.service;

import org.springframework.data.domain.Page;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/29 16:27
 */
public interface MemberService {

    Page<Object[]> getMembers(String mcId, Integer pageNum, Integer pageSize);
}
