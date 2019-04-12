package io.renren.modules.orderManagement.dao;

import io.renren.modules.orderManagement.entity.MerchantFeedback;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/4/9 16:24
 */
public interface MerchantFeedbackDao extends JpaRepository<MerchantFeedback, String> {

}
