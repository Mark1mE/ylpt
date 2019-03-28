package io.renren.orderManagement.service;

import io.renren.orderManagement.entity.OrderForm;
import io.renren.orderManagement.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/25 16:13
 */
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Page<OrderForm> findAllOrdersByPage(String merchantInfoId, Integer pageNum, Integer pageSize) {
        PageRequest request = new PageRequest(pageNum, pageSize, null);
        Page<OrderForm> page = orderRepository.findAllByMerchantInfoId(request, merchantInfoId);
        return page;
    }

    public Page<OrderForm> findAllOrdersByStatusAndPage(String merchantInfoId, Integer orderStatus, Integer pageNum, Integer pageSize) {
        PageRequest request = new PageRequest(pageNum, pageSize, null);
        Page<OrderForm> page = orderRepository.findAllByMerchantInfoIdAndOrderStatus(request, merchantInfoId, orderStatus);
        return page;
    }

    public OrderForm getOrderBySeriesNum(String seriesNum) {
        return orderRepository.findBySeriesNum(seriesNum);
    }

    public OrderForm updateUserAddress(OrderForm orderForm) {
        return orderRepository.save(orderForm);
    }

    public Page<Object[]> getCommentsByMvId(String mvId, Integer pageNum, Integer pageSize) {
        PageRequest request = new PageRequest(pageNum, pageSize, null);
        Page<Object[]> page = orderRepository.findComment(mvId, request);
        return page;
    }

    public Page<Object[]> findCommentsByCommentStar(String mvId, Integer star1, Integer star2, Integer pageNum, Integer pageSize) {
        PageRequest request = new PageRequest(pageNum, pageSize, null);
        Page<Object[]> page = orderRepository.findCommentByStar(mvId, star1, star2, request);
        return page;
    }
}
