package io.renren.orderManagement.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @description: 商品评论表
 * @author: 么红帅
 * @date: 2019/3/28 9:47
 */
@Entity
@Table(name = "comment")
@Data
@EntityListeners(AuditingEntityListener.class)
public class CommentTb {
    //用户商品评论表主键
    @Id
    private String commentId;
    //用户信息表主键
    private String userInfoId;
    //商品表id
    private String commodityId;
    //评论星级
    private int commentStar;
    //用户评论内容
    private String commentContent;
    //评论类型（评论还是回复）
    private int commentType;
    //父id
    private String parentId;
    //无限级路径
    private String columnPath;
    //无限级深度
    private int columnDepth;
    //是否审核
    private boolean audit;
    //审核用户id
    private String auditUser;
    //审核时间
    private Date auditTime;
    //创建时间
    @CreatedDate
    private Date createTime;
}
