package io.renren.modules.orderManagement.service;

import io.renren.modules.orderManagement.dto.OrderList;
import io.renren.modules.orderManagement.dto.UserReview;
import io.renren.modules.orderManagement.entity.MerchantFeedback;
import io.renren.modules.orderManagement.entity.OrderForm;
import io.renren.modules.orderManagement.entity.OrderSetting;
import org.springframework.data.domain.Page;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/25 16:13
 */
public interface OrderService {
    Page<OrderList> findAllOrdersByPage(String merchantInfoId, Integer pageNum, Integer pageSize);

    Page<OrderList> findAllOrdersByStatusAndPage(String merchantInfoId, Byte orderStatus, Integer pageNum, Integer pageSize);

    OrderForm getOrderBySeriesNum(String seriesNum);

    OrderForm updateUserAddress(OrderForm orderForm);

    Page<UserReview> getCommentsByMcId(String mcId, Integer pageNum, Integer pageSize);

    Page<UserReview> findCommentsByCommentStar(String mcId, Integer star1, Integer star2, Integer pageNum, Integer pageSize);

    void mcFeedbackUser(MerchantFeedback merchantFeedback);

    Page<OrderList> getAlreadyFeedBack(String mcId, Integer pageNum, Integer pageSize);

    Page<OrderList> getNotFeedBack(String mcId, Integer pageNum, Integer pageSize);

    void doOrderSetting(OrderSetting orderSetting);
}
