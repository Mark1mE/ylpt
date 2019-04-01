package io.renren.orderManagement.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @description: 商品信息表
 * @author: 么红帅
 * @date: 2019/3/28 10:15
 */
@Entity
@Table(name = "commodity_info")
@Data
@EntityListeners(AuditingEntityListener.class)
public class CommodityInfo {
    //商品id
    @Id
    private String goodsId;
    //商家id
    private String mcId;
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
    //宣传图片（存储地址）
    private String publicityPhoto;
    //商品状态
    private String goodsStatusId;
    //优惠价
    private double preferentialPrice;
    //折扣数0代表没有折扣
    private double discount;
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
    //显示级别
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
