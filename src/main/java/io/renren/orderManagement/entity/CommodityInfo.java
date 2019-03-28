package io.renren.orderManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @description: 商品信息表
 * @author: 么红帅
 * @date: 2019/3/28 10:15
 */
@Entity
public class CommodityInfo {
    //商品id
    @Id
    private String goodsId;
    //商家id
    private String mvId;
    //商品类型表主键
    private String ctId;
    //商品类型(0-实物产品, 1-服务产品, 2-电子卡券)
    private int goodsType;
    //销售类型(0-单个销售, 1-组合销售)
    private int saleType;
    //商品编码
    private String seriesNum;
    //商品条码
    private String barCode;
    //商品名称
    private String goodsName;
    //商品简介
    private String goodsRemark;
    //商品关键词
    private String  keywords;
    //建议零售价
    private double suggestPrice;
    //运费设置（0表示免邮费）
    private double shippingPrice;
    //设置购买权限(如果不设置购买权限，默认为0，即所有会员均可购买)
    private int buyPermission;
    //设置是否允许使用折扣及优惠
    private boolean discount;
    //宣传图片（存储地址）
    private String publicityPhoto;
    //商品状态
    private String goodsStatusId;
    //优惠价
    private double preferentialPrice;
    //总销量
    private int salesSum;
    // 访客数
    private int visitorNum;
    // 商品卖点
    private String goodsDesc;
    // 浏览量
    private int pageView;
    //商品标识(0表示纯商品，1表示纯服务，2商品转服务)
    private int goodsIdentify;
    //是否推荐
    private boolean isRecommend;
    //是否新品
    private boolean isNew;
    //是否热卖
    private boolean isHot;
    //显示级别???
    private int displayLevel;
    //点击数
    private int clickCount;
    //商品评价展示
    private boolean displayEvaluation;
    //销量纪录展示
    private boolean displayRecord;
    //售罄商品展示
    private boolean displaySoldout;
    //创建时间
    private Date createTime;
    //创建用户id
    private String createUser;
    //修改时间
    private Date updateTime;
    //修改用户id
    private String updateUser;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getMvId() {
        return mvId;
    }

    public void setMvId(String mvId) {
        this.mvId = mvId;
    }

    public String getCtId() {
        return ctId;
    }

    public void setCtId(String ctId) {
        this.ctId = ctId;
    }

    public int getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(int goodsType) {
        this.goodsType = goodsType;
    }

    public int getSaleType() {
        return saleType;
    }

    public void setSaleType(int saleType) {
        this.saleType = saleType;
    }

    public String getSeriesNum() {
        return seriesNum;
    }

    public void setSeriesNum(String seriesNum) {
        this.seriesNum = seriesNum;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsRemark() {
        return goodsRemark;
    }

    public void setGoodsRemark(String goodsRemark) {
        this.goodsRemark = goodsRemark;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public double getSuggestPrice() {
        return suggestPrice;
    }

    public void setSuggestPrice(double suggestPrice) {
        this.suggestPrice = suggestPrice;
    }

    public double getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(double shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public int getBuyPermission() {
        return buyPermission;
    }

    public void setBuyPermission(int buyPermission) {
        this.buyPermission = buyPermission;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public String getPublicityPhoto() {
        return publicityPhoto;
    }

    public void setPublicityPhoto(String publicityPhoto) {
        this.publicityPhoto = publicityPhoto;
    }

    public String getGoodsStatusId() {
        return goodsStatusId;
    }

    public void setGoodsStatusId(String goodsStatusId) {
        this.goodsStatusId = goodsStatusId;
    }

    public double getPreferentialPrice() {
        return preferentialPrice;
    }

    public void setPreferentialPrice(double preferentialPrice) {
        this.preferentialPrice = preferentialPrice;
    }

    public int getSalesSum() {
        return salesSum;
    }

    public void setSalesSum(int salesSum) {
        this.salesSum = salesSum;
    }

    public int getVisitorNum() {
        return visitorNum;
    }

    public void setVisitorNum(int visitorNum) {
        this.visitorNum = visitorNum;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public int getPageView() {
        return pageView;
    }

    public void setPageView(int pageView) {
        this.pageView = pageView;
    }

    public int getGoodsIdentify() {
        return goodsIdentify;
    }

    public void setGoodsIdentify(int goodsIdentify) {
        this.goodsIdentify = goodsIdentify;
    }

    public boolean isRecommend() {
        return isRecommend;
    }

    public void setRecommend(boolean recommend) {
        isRecommend = recommend;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    public int getDisplayLevel() {
        return displayLevel;
    }

    public void setDisplayLevel(int displayLevel) {
        this.displayLevel = displayLevel;
    }

    public int getClickCount() {
        return clickCount;
    }

    public void setClickCount(int clickCount) {
        this.clickCount = clickCount;
    }

    public boolean isDisplayEvaluation() {
        return displayEvaluation;
    }

    public void setDisplayEvaluation(boolean displayEvaluation) {
        this.displayEvaluation = displayEvaluation;
    }

    public boolean isDisplayRecord() {
        return displayRecord;
    }

    public void setDisplayRecord(boolean displayRecord) {
        this.displayRecord = displayRecord;
    }

    public boolean isDisplaySoldout() {
        return displaySoldout;
    }

    public void setDisplaySoldout(boolean displaySoldout) {
        this.displaySoldout = displaySoldout;
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
