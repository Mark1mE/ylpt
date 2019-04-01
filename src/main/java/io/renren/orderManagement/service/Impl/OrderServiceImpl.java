package io.renren.orderManagement.service.Impl;

import io.renren.orderManagement.dao.OrderDao;
import io.renren.orderManagement.entity.OrderForm;
import io.renren.orderManagement.service.OrderService;
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
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    public Page<OrderForm> findAllOrdersByPage(String merchantInfoId, Integer pageNum, Integer pageSize) {
        PageRequest request = new PageRequest(pageNum, pageSize, null);
        Page<OrderForm> page = orderDao.findAllByMerchantInfoId(request, merchantInfoId);
        return page;
    }

    public Page<OrderForm> findAllOrdersByStatusAndPage(String merchantInfoId, Integer orderStatus, Integer pageNum, Integer pageSize) {
        PageRequest request = new PageRequest(pageNum, pageSize, null);
        Page<OrderForm> page = orderDao.findAllByMerchantInfoIdAndOrderStatus(request, merchantInfoId, orderStatus);
        return page;
    }

    public OrderForm getOrderBySeriesNum(String seriesNum) {
        return orderDao.findBySeriesNum(seriesNum);
    }

    public OrderForm updateUserAddress(OrderForm orderForm) {
        return orderDao.save(orderForm);
    }

    public Page<Object[]> getCommentsByMvId(String mcId, Integer pageNum, Integer pageSize) {
        PageRequest request = new PageRequest(pageNum, pageSize, null);
        Page<Object[]> page = orderDao.findComment(mcId, request);
        return page;
    }

    public Page<Object[]> findCommentsByCommentStar(String mcId, Integer star1, Integer star2, Integer pageNum, Integer pageSize) {
        PageRequest request = new PageRequest(pageNum, pageSize, null);
        Page<Object[]> page = orderDao.findCommentByStar(mcId, star1, star2, request);
        return page;
    }
}
