package io.renren.orderManagement.dao;

import io.renren.orderManagement.entity.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/27 10:38
 */
public interface UserAddressDao extends JpaRepository<UserAddress, String> {
    UserAddress findByUaId(String uaId);
}
