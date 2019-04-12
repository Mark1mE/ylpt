package io.renren.modules.orderManagement.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @description: 订单商品关系表
 * @author: 么红帅
 * @date: 2019/4/7 17:06
 */
@Entity
@Table(name = "order_commodity_info")
@Data
public class OrderAndCommodity {
    @Id
    private String orderCommId;
    //订单编号
    private String orderId;
    //商品id
    private String commodityId;
    //备用字段
    private String field1;
    //备用字段
    private String field2;
    //备用字段
    private String field3;
}
