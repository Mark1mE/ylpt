package io.renren.modules.memberManagement.dao;

import io.renren.modules.memberManagement.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/24 22:06
 */
public interface MemberDao extends JpaRepository<Member, Long> {

    /**
     * @Author 么红帅
     * @Description 查询会员列表
     * @Date 20:14 2019/3/29
     * @Param [merchantInfoId, page]
     * @return org.springframework.data.domain.Page<java.lang.Object[]>
     **/
    @Query(value = "select cui.userMobile,cui.userName,cui.userGender,vug.label,cui.userAge,cui.area,mc.memberClassName\n" +
            "from VipUserAndGroup vug,CustomerUserInfo cui,Member m,MemberClass mc\n" +
            "where vug.userInfoId=cui.userInfoId and cui.userInfoId=m.userInfoId and m.memberClassId=mc.memberClassId and vug.merchantInfoId=?1")
    Page<Object[]> findMemberByOrders(@Param("mcId") String merchantInfoId, Pageable page);
}
