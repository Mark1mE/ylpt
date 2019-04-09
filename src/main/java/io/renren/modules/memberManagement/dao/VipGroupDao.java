package io.renren.modules.memberManagement.dao;

import io.renren.modules.memberManagement.entity.VipGroup;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/24 22:36
 */
public interface VipGroupDao extends JpaRepository<VipGroup, String>{
    List<VipGroup> findByMerchantInfoId(String mcId);
}
