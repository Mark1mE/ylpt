package io.renren.orderManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/25 15:41
 */
@Entity
public class OrderDetail {
    //这里是自增主键吗？
    @Id
    private int orderId;
    //物流id
    private int shippingId;
    //订单状态(0-待付款/1-待发货/2-待收货/3-交易成功/4-交易关闭/5-已取消/6-退款中)
    private int orderStatus;
    //订单编号
    private String seriesNum;
    //用户信息表主键
    private String userInfoId;
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
    private Date createTime;
    //创建用户id
    private String createUser;
    //修改时间
    private Date updateTime;
    //修改用户id
    private String updateUser;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getShippingId() {
        return shippingId;
    }

    public void setShippingId(int shippingId) {
        this.shippingId = shippingId;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getSeriesNum() {
        return seriesNum;
    }

    public void setSeriesNum(String seriesNum) {
        this.seriesNum = seriesNum;
    }

    public String getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(double actualAmount) {
        this.actualAmount = actualAmount;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUaId() {
        return uaId;
    }

    public void setUaId(String uaId) {
        this.uaId = uaId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public boolean isSettlement() {
        return settlement;
    }

    public void setSettlement(boolean settlement) {
        this.settlement = settlement;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}

