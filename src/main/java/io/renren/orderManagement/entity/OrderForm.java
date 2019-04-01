package io.renren.orderManagement.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/25 15:41
 */
@Entity
@Table(name = "order_form")
@Data
@EntityListeners(AuditingEntityListener.class)
public class OrderForm {
    //订单表主键
    @Id
    private String orderId;
    //物流id
    private Long shippingId;
    //订单状态(0-待付款/1-待发货/2-待收货/3-交易成功/4-交易关闭/5-已取消/6-退款中)
    private int orderStatus;
    //订单编号
    private String seriesNum;
    //用户信息表主键
    private String userInfoId;
    //商家信息表主键
    private String merchantInfoId;
    //订单类型（字典表:商品型，服务型）
    private int orderType;
    //订单总金额
    private double totalAmount;
    //实际金额
    private double actualAmount;
    //支付id
    private String payId;
    //收货地址
    private String userAddress;
    //用户收货地址表id
    private String uaId;
    //发票id
    private String invoiceId;
    //备注
    private String remark;
    //订单是否结算完成
    private boolean settlement;
    //创建时间
    @CreatedDate
    private Date createTime;
    //创建用户id
    private String createUser;
    //修改时间
    @LastModifiedDate
    private Date updateTime;
    //修改用户id
    private String updateUser;
}

