package io.renren.orderManagement.repository;

import io.renren.orderManagement.entity.OrderForm;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/25 15:49
 */
public interface OrderRepository extends PagingAndSortingRepository<OrderForm, Integer>, JpaRepository<OrderForm, Integer> {
    Page<OrderForm> findAllByMerchantInfoId(Pageable page, String merchantInfoId);

    Page<OrderForm> findAllByMerchantInfoIdAndOrderStatus(Pageable page, String merchantInfoId, Integer orserStatus);

    OrderForm findBySeriesNum(String seriesNum);

    /**
     * @Author 么红帅
     * @Description //TODO 查询对当前商家的商品的所有评论
     * @Date 18:17 2019/3/28
     * @Param [mvId, page]
     * @return org.springframework.data.domain.Page<java.lang.Object[]>
     **/
    @Query(value = "select ci.goodsName,ui.userInfoName,ct.commentStar,ct.createTime,ct.commentContent\n" +
            "from CommentTb ct,CommodityInfo ci,UserInfo ui\n" +
            "where ct.commodityId=ci.goodsId and ui.userInfoId=ct.userInfoId and ci.mvId=?1")
    Page<Object[]> findComment(@Param("mvId") String mvId, Pageable page);
}
