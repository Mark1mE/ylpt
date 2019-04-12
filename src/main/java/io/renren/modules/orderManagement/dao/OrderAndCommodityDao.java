package io.renren.modules.orderManagement.dao;

import io.renren.modules.orderManagement.entity.OrderAndCommodity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/4/8 20:02
 */
public interface OrderAndCommodityDao extends JpaRepository<OrderAndCommodity, String> {

    /**
     * @Author 么红帅
     * @Description 根据订单号获取订单中包含的商品的名称列表
     * @Date 22:57 2019/4/10
     * @Param [seriesNum]
     * @return java.util.List<java.lang.String>
     **/
    @Query(value = "select distinct ci.commodityName\n" +
            "from OrderAndCommodity oc,CommodityInfo ci\n" +
            "where oc.commodityId=ci.cId and oc.orderId in " +
            "(select ordf.orderId from OrderForm ordf where ordf.seriesNum=?1)")
    List<String> getCNBySeriesNum(@Param("seriesNum") String seriesNum);
}
