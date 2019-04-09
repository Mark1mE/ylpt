package io.renren.modules.orderManagement.dao;

import io.renren.modules.orderManagement.dto.OrderList;
import io.renren.modules.orderManagement.dto.UserReview;
import io.renren.modules.orderManagement.entity.OrderForm;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/25 15:49
 */
public interface OrderDao extends JpaRepository<OrderForm, String> {

    /**
     * @Author 么红帅
     * @Description 查询当前商家的所有订单
     * @Date 19:37 2019/4/8
     * @Param [page, merchantInfoId]
     * @return org.springframework.data.domain.Page<io.renren.modules.orderManagement.dto.OrderList>
     **/
    @Query(value="select new io.renren.modules.orderManagement.dto.OrderList(" +
            "ordf.seriesNum,ordf.orderStatus,ordf.createTime,ordf.totalAmount,ordf.actualAmount,ordf.orderType,ordf.paymentMethod," +
            "ua.receiverName,ua.receiverPhone,ordf.userAddress)\n" +
            "from OrderForm ordf,UserAddress ua " +
            "where ordf.uaId=ua.uaId and ordf.merchantInfoId=?1 ")
    Page<OrderList> getAllOrdersPage(@Param("merchantInfoId") String merchantInfoId, Pageable page);

    /**
     * @Author 么红帅
     * @Description 根据订单状态查询当前商家的所有订单
     * @Date 19:40 2019/4/8
     * @Param [page, merchantInfoId, orderStatus]
     * @return org.springframework.data.domain.Page<io.renren.modules.orderManagement.dto.OrderList>
     **/
    @Query(value = "select new io.renren.modules.orderManagement.dto.OrderList(" +
            "ordf.seriesNum,ordf.orderStatus,ordf.createTime,ordf.totalAmount,ordf.actualAmount,ordf.orderType,ordf.paymentMethod," +
            "ua.receiverName,ua.receiverPhone,ordf.userAddress)\n" +
            "from OrderForm ordf,UserAddress ua\n" +
            "where ordf.uaId=ua.uaId and ordf.merchantInfoId=?1 and ordf.orderStatus=?2")
    Page<OrderList> getAllOrdersStatus(@Param("merchantInfoId") String merchantInfoId, @Param("orderStatus") Byte orderStatus, Pageable page);

    OrderForm findBySeriesNum(String seriesNum);

    /**
     * @Author 么红帅
     * @Description 查询对当前商家的商品的所有评论 TODO 缺少评论图片相关信息
     * @Date 18:17 2019/3/28
     * @Param [mcId, page]
     * @return org.springframework.data.domain.Page<java.lang.Object[]>
     **/
    @Query(value = "select new io.renren.modules.orderManagement.dto.UserReview(" +
            "ci.publicityPhoto,ci.commodityName,cui.userName,ct.commentStar,ct.createTime,ct.commentContent)\n" +
            "from CommentTb ct,CommodityInfo ci,CustomerUserInfo cui\n" +
            "where ct.commodityId=ci.cId and cui.userInfoId=ct.userInfoId and ci.merchantInfoId=?1")
    Page<UserReview> getAllCommentsPage(@Param("mcId") String mcId, Pageable page);

    /**
     * @Author 么红帅
     * @Description //TODO 根据评级筛选评价，1-2为差评，3-3为中评，4-5为差评
     * @Date 19:01 2019/3/28
     * @Param [mcId, star1, star2, page]
     * @return org.springframework.data.domain.Page<java.lang.Object[]>
     **/
    @Query(value = "select new io.renren.modules.orderManagement.dto.UserReview(" +
            "ci.publicityPhoto,ci.commodityName,cui.userName,ct.commentStar,ct.createTime,ct.commentContent)\n" +
            "from CommentTb ct,CommodityInfo ci,CustomerUserInfo cui\n" +
            "where ct.commodityId=ci.cId and cui.userInfoId=ct.userInfoId\n" +
            "and ci.merchantInfoId=?1 and ct.commentStar between ?2 and ?3")
    Page<UserReview> getAllCommentsStarAndPage(@Param("mcId") String mcId,
                                       @Param("star1") Integer star1,
                                       @Param("star2") Integer star2,
                                       Pageable page);
}
