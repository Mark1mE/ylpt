package io.renren.modules.orderManagement.service.Impl;

import io.renren.modules.orderManagement.dao.MerchantFeedbackDao;
import io.renren.modules.orderManagement.dao.OrderAndCommodityDao;
import io.renren.modules.orderManagement.dao.OrderSettingDao;
import io.renren.modules.orderManagement.dto.OrderList;
import io.renren.modules.orderManagement.dto.UserReview;
import io.renren.modules.orderManagement.dao.OrderDao;
import io.renren.modules.orderManagement.entity.MerchantFeedback;
import io.renren.modules.orderManagement.entity.OrderForm;
import io.renren.modules.orderManagement.entity.OrderSetting;
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

    @Autowired
    private MerchantFeedbackDao merchantFeedbackDao;

    @Autowired
    private OrderSettingDao orderSettingDao;

    public Page<OrderList> findAllOrdersByPage(String merchantInfoId, Integer pageNum, Integer pageSize) {
        PageRequest request = new PageRequest(pageNum, pageSize, null);
        Page<OrderList> page = orderDao.getAllOrdersPage(merchantInfoId, request);
        return sn2CNL(page, pageNum, pageSize);
    }

    public Page<OrderList> findAllOrdersByStatusAndPage(String merchantInfoId, Byte orderStatus, Integer pageNum, Integer pageSize) {
        PageRequest request = new PageRequest(pageNum, pageSize, null);
        Page<OrderList> page = orderDao.getAllOrdersStatus(merchantInfoId, orderStatus, request);
        return sn2CNL(page, pageNum, pageSize);
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

    @Override
    public void mcFeedbackUser(MerchantFeedback merchantFeedback) {
        merchantFeedbackDao.save(merchantFeedback);
    }

    @Override
    public Page<OrderList> getAlreadyFeedBack(String mcId, Integer pageNum, Integer pageSize) {
        PageRequest request = new PageRequest(pageNum, pageSize, null);
        Page<OrderList> page = orderDao.getAlreadyFeedBack(mcId, request);
        return sn2CNL(page, pageNum, pageSize);
    }

    @Override
    public Page<OrderList> getNotFeedBack(String mcId, Integer pageNum, Integer pageSize) {
        PageRequest request = new PageRequest(pageNum, pageSize, null);
        Page<OrderList> page = orderDao.getNotFeedBack(mcId, request);
        return sn2CNL(page, pageNum, pageSize);
    }

    @Override
    public void doOrderSetting(OrderSetting orderSetting) {
        orderSettingDao.save(orderSetting);
    }

    /**
     * @Author 么红帅
     * @Description 将在结果中增加商品名称部分抽取为以下方法
     * @Date 23:10 2019/4/10
     * @Param [page, pageNum, pageSize]
     * @return org.springframework.data.domain.Page<io.renren.modules.orderManagement.dto.OrderList>
     **/
    public Page<OrderList> sn2CNL(Page<OrderList> page, Integer pageNum, Integer pageSize) {
        List<OrderList> list = page.getContent();
        for(OrderList ol : list) {
            String seriesNum = ol.getSeriesNum();
            List<String> nameString = orderAndCommodityDao.getCNBySeriesNum(seriesNum);
            ol.setCommodityName(ListUtils.list2String(nameString));
        }
        Long total = page.getTotalElements();
        return new PageImpl(list, new PageRequest(pageNum, pageSize), total);
    }
}
