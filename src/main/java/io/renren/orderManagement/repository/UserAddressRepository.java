package io.renren.orderManagement.repository;

import io.renren.orderManagement.entity.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/27 10:38
 */
public interface UserAddressRepository extends JpaRepository<UserAddress, Integer> {
    UserAddress findByUaId(String uaId);
}
