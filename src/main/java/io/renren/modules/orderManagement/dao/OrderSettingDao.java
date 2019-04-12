package io.renren.modules.orderManagement.dao;

import io.renren.modules.orderManagement.entity.OrderSetting;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/4/10 20:43
 */
public interface OrderSettingDao extends JpaRepository<OrderSetting, String> {
}
