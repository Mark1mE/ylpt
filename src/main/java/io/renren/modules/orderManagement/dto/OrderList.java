package io.renren.modules.orderManagement.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/4/7 23:32
 */
@Data
public class OrderList {
    //订单编号
    private String seriesNum;
    //商品名称
    private String commodityName;
    //订单状态(0-待付款/1-待发货/2-待收货/3-交易成功/4-交易关闭/5-已取消/6-退款中)
    private Byte orderStatus;
    //创建时间
    private Date createTime;
    //订单总金额
    private BigDecimal totalAmount;
    //实际金额
    private BigDecimal actualAmount;
    //订单类型（字典表:商品型，服务型）
    private int orderType;
    //TODO 支付方式
    private Byte paymentMethod;
    //收货人姓名
    private String receiverName;
    //收货人电话
    private String receiverPhone;
    //收获地址
    private String address;

    public OrderList(String seriesNum, Byte orderStatus, Date createTime, BigDecimal totalAmount, BigDecimal actualAmount, int orderType, Byte paymentMethod, String receiverName, String receiverPhone, String address) {
        this.seriesNum = seriesNum;
        this.orderStatus = orderStatus;
        this.createTime = createTime;
        this.totalAmount = totalAmount;
        this.actualAmount = actualAmount;
        this.orderType = orderType;
        this.paymentMethod = paymentMethod;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.address = address;
    }
}
