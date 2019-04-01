package io.renren.orderManagement.service;

import io.renren.orderManagement.entity.OrderForm;
import org.springframework.data.domain.Page;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/25 16:13
 */
public interface OrderService {
    Page<OrderForm> findAllOrdersByPage(String merchantInfoId, Integer pageNum, Integer pageSize);

    Page<OrderForm> findAllOrdersByStatusAndPage(String merchantInfoId, Integer orderStatus, Integer pageNum, Integer pageSize);

    OrderForm getOrderBySeriesNum(String seriesNum);

    OrderForm updateUserAddress(OrderForm orderForm);

    Page<Object[]> getCommentsByMvId(String mcId, Integer pageNum, Integer pageSize);

    Page<Object[]> findCommentsByCommentStar(String mcId, Integer star1, Integer star2, Integer pageNum, Integer pageSize);
}
