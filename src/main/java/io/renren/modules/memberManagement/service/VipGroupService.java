package io.renren.modules.memberManagement.service;

import io.renren.modules.memberManagement.entity.VipGroup;

import java.util.List;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/24 23:40
 */
public interface VipGroupService {

    List<VipGroup> getMemberGroupAndCount(String mcId);
}
