package io.renren.orderManagement.dao;

import io.renren.orderManagement.entity.OrderForm;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/25 15:49
 */
public interface OrderDao extends PagingAndSortingRepository<OrderForm, String>, JpaRepository<OrderForm, String> {
    Page<OrderForm> findAllByMerchantInfoId(Pageable page, String merchantInfoId);

    Page<OrderForm> findAllByMerchantInfoIdAndOrderStatus(Pageable page, String merchantInfoId, Integer orserStatus);

    OrderForm findBySeriesNum(String seriesNum);

    /**
     * @Author 么红帅
     * @Description 查询对当前商家的商品的所有评论
     * @Date 18:17 2019/3/28
     * @Param [mcId, page]
     * @return org.springframework.data.domain.Page<java.lang.Object[]>
     **/
    @Query(value = "select ci.goodsName,cui.userName,ct.commentStar,ct.createTime,ct.commentContent\n" +
            "from CommentTb ct,CommodityInfo ci,CustomerUserInfo cui\n" +
            "where ct.commodityId=ci.goodsId and cui.userInfoId=ct.userInfoId and ci.mcId=?1")
    Page<Object[]> findComment(@Param("mcId") String mcId, Pageable page);

    /**
     * @Author 么红帅
     * @Description //TODO 根据评级筛选评价，1-2为差评，3-3为中评，4-5为差评
     * @Date 19:01 2019/3/28
     * @Param [mcId, star1, star2, page]
     * @return org.springframework.data.domain.Page<java.lang.Object[]>
     **/
    @Query(value = "select ci.goodsName,cui.userName,ct.commentStar,ct.createTime,ct.commentContent\n" +
            "from CommentTb ct,CommodityInfo ci,CustomerUserInfo cui\n" +
            "where ct.commodityId=ci.goodsId and cui.userInfoId=ct.userInfoId\n" +
            "and ci.mcId=?1 and ct.commentStar between ?2 and ?3")
    Page<Object[]> findCommentByStar(@Param("mcId") String mcId,
                                     @Param("star1") Integer star1,
                                     @Param("star2") Integer star2,
                                     Pageable page);
}
