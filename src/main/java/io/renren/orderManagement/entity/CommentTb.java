package io.renren.orderManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @description: 评论表
 * @author: 么红帅
 * @date: 2019/3/28 9:47
 */
@Entity
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
    private Date createTime;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public int getCommentStar() {
        return commentStar;
    }

    public void setCommentStar(int commentStar) {
        this.commentStar = commentStar;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public int getCommentType() {
        return commentType;
    }

    public void setCommentType(int commentType) {
        this.commentType = commentType;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getColumnPath() {
        return columnPath;
    }

    public void setColumnPath(String columnPath) {
        this.columnPath = columnPath;
    }

    public int getColumnDepth() {
        return columnDepth;
    }

    public void setColumnDepth(int columnDepth) {
        this.columnDepth = columnDepth;
    }

    public boolean isAudit() {
        return audit;
    }

    public void setAudit(boolean audit) {
        this.audit = audit;
    }

    public String getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(String auditUser) {
        this.auditUser = auditUser;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
