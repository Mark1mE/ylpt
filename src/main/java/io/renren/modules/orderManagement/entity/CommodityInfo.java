package io.renren.modules.orderManagement.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
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
    /**
     * 商品id
     */
    @Id
    private String cId;

    /**
     * 商家id，外键
     */
    private String merchantInfoId;

    /**
     * 商品分类表id，外键
     */
    private Long ctId;

    /**
     * 商品类型，0-实物产品；1-服务产品；2-电子卡券
     */
    private Byte commodityType;

    /**
     * 销售类型非空，0-单个销售；1-组合销售
     */
    private Byte saleType;

    /**
     * 商品编码，如果没有，系统自动生成
     */
    private String seriesNum;

    /**
     * 商品条码，如果没有，系统自动生成
     */
    private String barCode;

    /**
     * 商品名称
     */
    private String commodityName;

    /**
     * 商品简介
     */
    private String commodityRemark;

    /**
     * 商品关键词
     */
    private String keywords;

    /**
     * 建议零售价
     */
    private BigDecimal suggestPrice;

    /**
     * 划线价
     */
    private BigDecimal linePrice;

    /**
     * 运费设置（0表示免运费）
     */
    private BigDecimal shippingPrice;

    /**
     * 设置购买权限，如果不设置购买权限，默认为0，即所有会员均可以购买
     */
    private Integer buyPermission;

    /**
     * 可购买该商品的会员身份（会员等级）
     */
    private String memberClassName;

    /**
     * 设置是否允许使用折扣及优惠，0-不允许；1-允许
     */
    private Byte discount;

    /**
     * 是否提供服务，0-不提供服务（默认）；1-提供服务（同时保存服务信息到服务信息表里）
     */
    private Byte provideService;

    /**
     * 宣传图片（存储地址）（建议800*600像素）
     */
    private String publicityPhoto;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 提交审核时间
     */
    private Date submissionTime;

    /**
     * 优惠价
     */
    private BigDecimal preferentialPrice;

    /**
     * 总销量
     */
    private Integer salesSum;

    /**
     * 访客数
     */
    private Integer visitorNum;

    /**
     * 浏览量
     */
    private Integer pageView;

    /**
     * 是否推荐（默认0）
     */
    private Byte isRecommend;

    /**
     * 是否新品（默认0）
     */
    private Byte isNew;

    /**
     * 是否热卖（默认0）
     */
    private Byte isHot;

    /**
     * 显示级别（默认0）
     */
    private Byte displayLevel;

    /**
     * 点击数（默认0）
     */
    private Integer clickCount;

    /**
     * 最后更新时间
     */
    @LastModifiedDate
    private Date lastUpdate;

    /**
     * 商品评价展示，0-展示；1-隐藏
     */
    private Byte displayEvaluation;

    /**
     * 销量纪录展示，0-展示；1-隐藏
     */
    private Byte displayRecord;

    /**
     * 售罄商品展示，0-展示；1-隐藏
     */
    private Byte displaySoldout;

    /**
     * 是否是组合产品，0-不是（默认）；1-是（需要在组合商品表里保存组合信息）
     */
    private Byte isCombination;

    /**
     * 商品卖点
     */
    private String commodityDesc;

    private static final long serialVersionUID = 1L;
}
