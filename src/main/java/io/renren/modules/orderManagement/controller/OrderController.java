package io.renren.modules.orderManagement.controller;

import io.renren.modules.orderManagement.dto.OrderList;
import io.renren.modules.orderManagement.dto.UserReview;
import io.renren.modules.orderManagement.entity.MerchantFeedback;
import io.renren.modules.orderManagement.entity.OrderForm;
import io.renren.modules.orderManagement.entity.OrderSetting;
import io.renren.modules.orderManagement.entity.UserAddress;
import io.renren.modules.orderManagement.service.Impl.OrderServiceImpl;
import io.renren.modules.orderManagement.service.Impl.UserAddressServiceImpl;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/25 16:10
 */
@RestController
public class OrderController {
    @Autowired
    private OrderServiceImpl orderService;

    @Autowired
    private UserAddressServiceImpl userAddressService;

    /**
     * @Author 么红帅
     * @Description 获取当前商家所有订单的分页数据
     * @Date 12:54 2019/3/26
     * @Param [merchantInfoId, pageNum为1...n的数据，调用时代码会自动-1, pageSize]
     * @return
     **/
    @GetMapping("/orderList")
    public Page<OrderList> getOrderList(@RequestParam String merchantInfoId,
                                        @RequestParam(defaultValue = "1",value = "currentPage") Integer pageNum,
                                        @RequestParam(defaultValue = "10",value = "pageSize") Integer pageSize) {
        Page<OrderList> page = orderService.findAllOrdersByPage(merchantInfoId, pageNum - 1, pageSize);
        return page;
    }

    /**
     * @Author 么红帅
     * @Description 根据订单状态查询当前商家的所有订单
     * @Date 23:28 2019/3/27
     * @Param [merchantInfoId, orderStatus, pageNum, pageSize]
     * @return
     **/
    @GetMapping("/orderList/orderStatus")
    public Page<OrderList> getOrderListByStatus(@RequestParam String merchantInfoId, @RequestParam Byte orderStatus,
                                        @RequestParam(defaultValue = "1",value = "currentPage") Integer pageNum,
                                        @RequestParam(defaultValue = "10",value = "pageSize") Integer pageSize) {
        return orderService.findAllOrdersByStatusAndPage(merchantInfoId, orderStatus, pageNum - 1, pageSize);
    }

    /**
     * @Author 么红帅
     * @Description 获取订单详情中的订单信息
     * @Date 16:06 2019/3/26
     * @Param
     * @return
     **/
    @GetMapping("/orderList/orderInfo")
    @ResponseBody
    public String getOrderInfo(@RequestParam String seriesNum) {
        Map<String, Object> map = new HashMap<>();
        OrderForm ordf = orderService.getOrderBySeriesNum(seriesNum);
        map.put("createTime", ordf.getCreateTime());
        map.put("orderStatus", ordf.getOrderStatus());
        map.put("remark", ordf.getRemark());
        map.put("userAddress", ordf.getUserAddress());
        UserAddress userAddress = userAddressService.getUserInfoByUaId(ordf.getUaId());
        map.put("receiverName", userAddress.getReceiverName());
        map.put("receiverPhone", userAddress.getReceiverPhone());
        //map.put("addressDetail", userAddress.getAddressDetail());
        return map.toString();
    }

    /**
     * @Author 么红帅
     * @Description 根据订单号更改用户收货地址
     * @Date 20:41 2019/3/27
     * @Param [seriesNum, userAddress]
     * @return
     **/
    @PostMapping("/orderList/orderInfo/userAddress")
    public void updateUserAddress(@RequestParam String seriesNum,
                                  @RequestParam String userAddress) {
        OrderForm orderDetail = orderService.getOrderBySeriesNum(seriesNum);
        orderDetail.setUserAddress(userAddress);
        orderService.updateUserAddress(orderDetail);
    }

    /**
     * @Author 么红帅
     * @Description 获取对商家的所有评价
     * @Date 13:23 2019/3/29
     * @Param [mcId, pageNum, pageSize]
     * @return org.springframework.data.domain.Page<java.lang.Object[]>
     **/
    @GetMapping("/comments")
    public Page<UserReview> getAllComments(@RequestParam String mcId,
                                         @RequestParam(defaultValue = "1",value = "currentPage") Integer pageNum,
                                         @RequestParam(defaultValue = "10",value = "pageSize") Integer pageSize) {
        return orderService.getCommentsByMcId(mcId, pageNum - 1, pageSize);
    }

    /**
     * @Author 么红帅
     * @Description //TODO 根据评级筛选评价，1-2为差评，3-3为中评，4-5为差评
     * @Date 19:01 2019/3/28
     * @Param [mcId, star1, star2, page]
     * @return org.springframework.data.domain.Page<java.lang.Object[]>
     **/
    @GetMapping("/comments/star")
    public Page<UserReview> getCommentsByStar(@RequestParam String mcId, @RequestParam Integer star1, @RequestParam Integer star2,
                                              @RequestParam(defaultValue = "1",value = "currentPage") Integer pageNum,
                                              @RequestParam(defaultValue = "10",value = "pageSize") Integer pageSize) {
        return orderService.findCommentsByCommentStar(mcId, star1, star2, pageNum - 1, pageSize);
    }

    /**
     * @Author 么红帅
     * @Description 商家对订单中的用户进行评价
     * @Date 19:23 2019/4/9
     * @Param [mcId, seriesNum, score, backContent, feedbackPhoto]
     * @return void
     **/
    @PostMapping("/orderList/mcFeedback")
    public void mcFeedback(@RequestParam Long mcId, @RequestParam String seriesNum, @RequestParam Integer score,
                           @RequestParam String backContent, @RequestParam String feedbackPhoto) {
        MerchantFeedback merchantFeedback = new MerchantFeedback(mcId, seriesNum, score, backContent, feedbackPhoto);
        // TODO 需要主键生成算法
        merchantFeedback.setEvaluationId("zijisheding");
        orderService.mcFeedbackUser(merchantFeedback);
    }

    /**
     * @Author 么红帅
     * @Description 查询商家订单中商家已对用户做出评价的订单
     * @Date 19:23 2019/4/9
     * @Param [merchantInfoId, pageNum, pageSize]
     * @return org.springframework.data.domain.Page<io.renren.modules.orderManagement.dto.OrderList>
     **/
    @GetMapping("/orderList/mcFeedback/already")
    public Page<OrderList> getAlreadyFeedback(@RequestParam String merchantInfoId,
                                        @RequestParam(defaultValue = "1",value = "currentPage") Integer pageNum,
                                        @RequestParam(defaultValue = "10",value = "pageSize") Integer pageSize) {
        Page<OrderList> page = orderService.getAlreadyFeedBack(merchantInfoId, pageNum - 1, pageSize);
        return page;
    }

    /**
     * @Author 么红帅
     * @Description 查询商家订单中商家未对用户做出评价的订单
     * @Date 22:01 2019/4/10
     * @Param [merchantInfoId, pageNum, pageSize]
     * @return org.springframework.data.domain.Page<io.renren.modules.orderManagement.dto.OrderList>
     **/
    @GetMapping("/orderList/mcFeedback/not")
    public Page<OrderList> getNotFeedback(@RequestParam String merchantInfoId,
                                              @RequestParam(defaultValue = "1",value = "currentPage") Integer pageNum,
                                              @RequestParam(defaultValue = "10",value = "pageSize") Integer pageSize) {
        Page<OrderList> page = orderService.getNotFeedBack(merchantInfoId, pageNum - 1, pageSize);
        return page;
    }
    
    @PostMapping("/orderSetting")
    public void doOrderSetting(@RequestParam("merchantInfoId") String merchantInfoId,
                               @RequestParam("orderCancelTime") Integer orderCancelTime,
                               @RequestParam("automaticConfirmTime") Integer automaticConfirmTime,
                               @RequestParam("serviceCompleteTime") Integer serviceCompleteTime) {
        OrderSetting orderSetting = new OrderSetting();
        // TODO 主键生成
        orderSetting.setOrderSettingId("daishezhi");
        orderSetting.setMerchantInfoId(merchantInfoId);
        orderSetting.setOrderCancelTime(orderCancelTime);
        orderSetting.setAutomaticConfirmTime(automaticConfirmTime);
        orderSetting.setServiceCompleteTime(serviceCompleteTime);
        orderService.doOrderSetting(orderSetting);
    }
}
