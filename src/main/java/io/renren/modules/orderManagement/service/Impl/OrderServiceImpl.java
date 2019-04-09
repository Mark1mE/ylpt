package io.renren.modules.orderManagement.service.Impl;

import io.renren.modules.orderManagement.dao.OrderAndCommodityDao;
import io.renren.modules.orderManagement.dto.OrderList;
import io.renren.modules.orderManagement.dto.UserReview;
import io.renren.modules.orderManagement.dao.OrderDao;
import io.renren.modules.orderManagement.entity.OrderForm;
import io.renren.modules.orderManagement.service.OrderService;
import io.renren.modules.orderManagement.util.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/25 16:13
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Autowired
    private OrderAndCommodityDao orderAndCommodityDao;

    public Page<OrderList> findAllOrdersByPage(String merchantInfoId, Integer pageNum, Integer pageSize) {
        PageRequest request = new PageRequest(pageNum, pageSize, null);
        Page<OrderList> page = orderDao.getAllOrdersPage(merchantInfoId, request);
        List<OrderList> list = page.getContent();
        for(OrderList ol : list) {
            String seriesNum = ol.getSeriesNum();
            List<String> nameString = orderAndCommodityDao.getCNBySeriesNum(seriesNum);
            ol.setCommodityName(ListUtils.list2String(nameString));
        }
        Long total = page.getTotalElements();
        Page<OrderList> result = new PageImpl(list, new PageRequest(pageNum, pageSize), total);
        return result;
    }

    public Page<OrderList> findAllOrdersByStatusAndPage(String merchantInfoId, Byte orderStatus, Integer pageNum, Integer pageSize) {
        PageRequest request = new PageRequest(pageNum, pageSize, null);
        Page<OrderList> page = orderDao.getAllOrdersStatus(merchantInfoId, orderStatus, request);
        List<OrderList> list = page.getContent();
        for(OrderList ol : list) {
            String seriesNum = ol.getSeriesNum();
            List<String> nameString = orderAndCommodityDao.getCNBySeriesNum(seriesNum);
            ol.setCommodityName(ListUtils.list2String(nameString));
        }
        Long total = page.getTotalElements();
        Page<OrderList> result = new PageImpl(list, new PageRequest(pageNum, pageSize), total);
        return result;
    }

    public OrderForm getOrderBySeriesNum(String seriesNum) {
        return orderDao.findBySeriesNum(seriesNum);
    }

    public OrderForm updateUserAddress(OrderForm orderForm) {
        return orderDao.save(orderForm);
    }

    public Page<UserReview> getCommentsByMcId(String mcId, Integer pageNum, Integer pageSize) {
        PageRequest request = new PageRequest(pageNum, pageSize, null);
        Page<UserReview> page = orderDao.getAllCommentsPage(mcId, request);
        return page;
    }

    public Page<UserReview> findCommentsByCommentStar(String mcId, Integer star1, Integer star2, Integer pageNum, Integer pageSize) {
        PageRequest request = new PageRequest(pageNum, pageSize, null);
        Page<UserReview> page = orderDao.getAllCommentsStarAndPage(mcId, star1, star2, request);
        return page;
    }
}
