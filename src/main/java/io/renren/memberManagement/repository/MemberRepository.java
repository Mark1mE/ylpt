package io.renren.memberManagement.repository;

import io.renren.memberManagement.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/24 22:06
 */
public interface MemberRepository extends JpaRepository<Member, Integer> {
    Integer countByMemberGroupId(int memberGroupId);

    /**
     * @Author 么红帅
     * @Description //TODO 查询会员列表，限制条件为：购买过自家商品的会员
     * @Date 20:14 2019/3/29
     * @Param [merchantInfoId, page]
     * @return org.springframework.data.domain.Page<java.lang.Object[]>
     **/
    //查询出的内容需要补全，首先更改表
    @Query(value = "select ui.userInfoPhoneNum,ui.userInfoName,m.memberClassId\n" +
            "from OrderForm odf,UserInfo ui,Member m\n" +
            "where odf.userInfoId=m.userId and m.userId=ui.userInfoId and odf.merchantInfoId=?1")
    Page<Object[]> findMemberByOrders(@Param("mvId") String merchantInfoId, Pageable page);
}
