package io.renren.orderManagement.service;

import io.renren.orderManagement.entity.UserAddress;
import io.renren.orderManagement.repository.UserAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/27 10:41
 */
@Service
public class UserAddressService {
    @Autowired
    private UserAddressRepository userAddressRepository;

    public UserAddress getUserInfoByUaId(String uaId) {
        return userAddressRepository.findByUaId(uaId);
    }
}
