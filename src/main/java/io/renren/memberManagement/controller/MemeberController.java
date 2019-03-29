package io.renren.memberManagement.controller;

import io.renren.memberManagement.service.MemberService;
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
public class MemeberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/members")
    public Page<Object[]> getAllMembers(@RequestParam String mvId,
                                        @RequestParam(defaultValue = "1",value = "currentPage") Integer pageNum,
                                        @RequestParam(defaultValue = "10",value = "pageSize") Integer pageSize) {
        return memberService.getMembers(mvId, pageNum - 1, pageSize);

    }
}
