package io.renren.modules.orderManagement.entity;

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
 * @description: 商家反馈表
 * @author: 么红帅
 * @date: 2019/4/8 15:05
 */
@Entity
@Table(name = "tb_merchant_feedback")
@Data
@EntityListeners(AuditingEntityListener.class)
public class MerchantFeedback {
    @Id
    //商家评价id
    private String evaluationId;
    //商家id
    private Long mcId;
    //订单编号
    private String seriesNum;
    //评分
    private Integer score;
    //评论内容
    private String backContent;
    //评论图片（存储地址）
    private String feedbackPhoto;
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
    //备用字段
    private String field1;
    //备用字段
    private String field2;
    //备用字段
    private String field3;

    public MerchantFeedback() {
    }

    public MerchantFeedback(Long mcId, String seriesNum, Integer score, String backContent, String feedbackPhoto) {
        this.mcId = mcId;
        this.seriesNum = seriesNum;
        this.score = score;
        this.backContent = backContent;
        this.feedbackPhoto = feedbackPhoto;
    }
}
