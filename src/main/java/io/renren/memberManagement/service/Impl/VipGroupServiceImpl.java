package io.renren.memberManagement.service.Impl;

import io.renren.memberManagement.dao.VipGroupDao;
import io.renren.memberManagement.entity.VipGroup;
import io.renren.memberManagement.service.VipGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/24 23:40
 */
@Service
public class VipGroupServiceImpl implements VipGroupService {
    @Autowired
    private VipGroupDao vipGroupDao;

    public List<VipGroup> getMemberGroupAndCount() {
        return vipGroupDao.findAll();
    }
}
