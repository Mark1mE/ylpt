package io.renren.orderManagement.controller;

import io.renren.orderManagement.entity.OrderForm;
import io.renren.orderManagement.entity.UserAddress;
import io.renren.orderManagement.service.OrderService;
import io.renren.orderManagement.service.UserAddressService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/25 16:10
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private UserAddressService userAddressService;

    /**
     * @Author 么红帅
     * @Description //TODO 获取所有订单的分页数据
     * @Date 12:54 2019/3/26
     * @Param [merchantInfoId, pageNum为1...n的数据，调用时代码会自动-1, pageSize]
     * @return [merchantInfoId, pageNum, pageSize]
     **/
    @GetMapping("/orderList")
    //每一条记录还是所有字段，还未筛选
    public Page<OrderForm> getOrderList(@RequestParam String merchantInfoId,
                                        @RequestParam(defaultValue = "1",value = "currentPage") Integer pageNum,
                                        @RequestParam(defaultValue = "10",value = "pageSize") Integer pageSize) {
        return orderService.findAllOrdersByPage(merchantInfoId, pageNum - 1, pageSize);
    }

    /**
     * @Author 么红帅
     * @Description //TODO 根据订单状态获取订单的分页数据
     * @Date 23:28 2019/3/27
     * @Param [merchantInfoId, orderStatus, pageNum, pageSize]
     * @return [merchantInfoId, orderStatus, pageNum, pageSize]
     **/
    @GetMapping("/orderList/orderStatus")
    public Page<OrderForm> getOrderListByStatus(@RequestParam String merchantInfoId, @RequestParam Integer orderStatus,
                                        @RequestParam(defaultValue = "1",value = "currentPage") Integer pageNum,
                                        @RequestParam(defaultValue = "10",value = "pageSize") Integer pageSize) {
        return orderService.findAllOrdersByStatusAndPage(merchantInfoId, orderStatus, pageNum - 1, pageSize);
    }


    /**
     * @Author 么红帅
     * @Description //TODO 获取订单详情中的订单信息
     * @Date 16:06 2019/3/26
     * @Param
     * @return
     **/
    @GetMapping("/orderList/orderInfo")
    @ResponseBody
    public String getOrderInfo(@RequestParam String seriesNum) {
        Map<String, Object> map = new HashMap<>();
        OrderForm orderForm = orderService.getOrderBySeriesNum(seriesNum);
        //createTime是下单时间吗？
        map.put("createTime", orderForm.getCreateTime());
        map.put("orderStatus", orderForm.getOrderStatus());
        map.put("remark", orderForm.getRemark());
        map.put("userAddress", orderForm.getUserAddress());
        UserAddress userAddress = userAddressService.getUserInfoByUaId(orderForm.getUaId());
        map.put("receiverName", userAddress.getReceiverName());
        map.put("receiverPhone", userAddress.getReceiverPhone());
        //map.put("addressDetail", userAddress.getAddressDetail());
        return JSONObject.toJSONString(map);
    }

    /**
     * @Author 么红帅
     * @Description //TODO 根据订单号更改用户收货地址
     * @Date 20:41 2019/3/27
     * @Param [seriesNum, userAddress]
     * @return [seriesNum, userAddress]
     **/
    @PostMapping("/orderList/orderInfo/userAddress")
    public void updateUserAddress(@RequestParam String seriesNum,
                                  @RequestParam String userAddress) {
        OrderForm orderDetail = orderService.getOrderBySeriesNum(seriesNum);
        orderDetail.setUserAddress(userAddress);
        orderService.updateUserAddress(orderDetail);
    }

    @GetMapping("/comments")
    public Page<Object[]> getAllComments(@RequestParam String mvId,
                                         @RequestParam(defaultValue = "1",value = "currentPage") Integer pageNum,
                                         @RequestParam(defaultValue = "10",value = "pageSize") Integer pageSize) {
        return orderService.getCommentsByMvId(mvId, pageNum - 1, pageSize);
    }

    @GetMapping("/comments/star")
    public Page<Object[]> getCommentsByStar(@RequestParam String mvId, @RequestParam Integer star1, @RequestParam Integer star2,
                                            @RequestParam(defaultValue = "1",value = "currentPage") Integer pageNum,
                                            @RequestParam(defaultValue = "10",value = "pageSize") Integer pageSize) {
        return orderService.findCommentsByCommentStar(mvId, star1, star2, pageNum, pageSize);
    }

    //test

}
