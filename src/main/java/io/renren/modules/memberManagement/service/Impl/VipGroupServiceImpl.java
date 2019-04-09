package io.renren.modules.memberManagement.service.Impl;

import io.renren.modules.memberManagement.dao.VipGroupDao;
import io.renren.modules.memberManagement.entity.VipGroup;
import io.renren.modules.memberManagement.service.VipGroupService;
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

    public List<VipGroup> getMemberGroupAndCount(String mcId) {
        return vipGroupDao.findByMerchantInfoId(mcId);
    }
}
