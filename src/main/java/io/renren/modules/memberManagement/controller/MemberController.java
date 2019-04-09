package io.renren.modules.memberManagement.controller;

import io.renren.modules.memberManagement.service.Impl.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/29 16:25
 */
@RestController
public class MemberController {
    @Autowired
    private MemberServiceImpl memberService;

    @GetMapping("/members")
    public Page<Object[]> getAllMembers(@RequestParam String mcId,
                                        @RequestParam(defaultValue = "1",value = "currentPage") Integer pageNum,
                                        @RequestParam(defaultValue = "10",value = "pageSize") Integer pageSize) {
        return memberService.getMembers(mcId, pageNum - 1, pageSize);

    }
}
