package io.renren.memberManagement.service;

import io.renren.memberManagement.entity.VipGroup;

import java.util.List;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/24 23:40
 */
public interface VipGroupService {

    List<VipGroup> getMemberGroupAndCount();
}
