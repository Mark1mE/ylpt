package io.renren.memberManagement.repository;

import io.renren.memberManagement.entity.MemberGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/24 22:36
 */
public interface MemberGroupRepository extends JpaRepository<MemberGroup, Integer>{
    List<MemberGroup> findAll();
}
