package io.renren.modules.orderManagement.service;

import io.renren.modules.orderManagement.entity.UserAddress;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/27 10:41
 */
public interface UserAddressService {
    UserAddress getUserInfoByUaId(String uaId);
}
