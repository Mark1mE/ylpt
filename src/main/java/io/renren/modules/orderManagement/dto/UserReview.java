package io.renren.modules.orderManagement.dto;

import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/4/4 10:43
 */
@Data
public class UserReview {
    //宣传图片（存储地址）
    private String publicityPhoto;
    //商品名称
    private String commodityName;
    //用户
    private String userName;
    //星级
    private int commentStar;
    //评论时间
    private Date createTime;
    //评论内容
    private String commentContent;

    public UserReview(String publicityPhoto, String commodityName, String userName, int commentStar, Date createTime, String commentContent) {
        this.publicityPhoto = publicityPhoto;
        this.commodityName = commodityName;
        this.userName = userName;
        this.commentStar = commentStar;
        this.createTime = createTime;
        this.commentContent = commentContent;
    }
}

