package io.renren.memberManagement.repository;

import io.renren.memberManagement.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/24 22:06
 */
public interface MemberRepository extends JpaRepository<Member, Integer> {
    Integer countByMemberGroupId(int memberGroupId);
}
