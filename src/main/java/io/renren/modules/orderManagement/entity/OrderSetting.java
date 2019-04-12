package io.renren.modules.orderManagement.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/4/1 16:08
 */
@Entity
@Table(name = "order_setting")
@Data
public class OrderSetting {
    @Id
    //订单设置id
    private String orderSettingId;
    //商家信息id
    private String merchantInfoId;
    //订单取消时间，拍下未付款超时后则取消订单
    private int orderCancelTime;
    //发货后多少天自动确认收货
    private int automaticConfirmTime;
    //服务完成时间设置
    private int serviceCompleteTime;
}
