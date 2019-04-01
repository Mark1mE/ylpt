package io.renren.orderManagement.service.Impl;

import io.renren.orderManagement.dao.UserAddressDao;
import io.renren.orderManagement.entity.UserAddress;
import io.renren.orderManagement.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/27 10:41
 */
@Service
public class UserAddressServiceImpl implements UserAddressService {
    @Autowired
    private UserAddressDao userAddressDao;

    public UserAddress getUserInfoByUaId(String uaId) {
        return userAddressDao.findByUaId(uaId);
    }
}
