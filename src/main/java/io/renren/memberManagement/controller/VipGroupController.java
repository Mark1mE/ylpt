package io.renren.memberManagement.controller;

import io.renren.memberManagement.entity.VipGroup;
import io.renren.memberManagement.service.Impl.VipGroupServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/24 22:29
 */
@RestController
public class VipGroupController {

    @Autowired
    private VipGroupServiceImpl vipGroupService;

    /**
     * @Author 么红帅
     * @Description 获取会员群组及对应的人数
     * @Date 13:02 2019/3/26
     * @Param []
     * @return
     **/
    @GetMapping("/memberGroupAndCount")
    public List<VipGroup> getMemberGroup() {
        return vipGroupService.getMemberGroupAndCount();
    }
}
