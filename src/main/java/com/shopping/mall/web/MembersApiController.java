package com.shopping.mall.web;

import com.shopping.mall.service.members.MembersService;
import com.shopping.mall.web.dto.MembersJoinRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MembersApiController {

    private final MembersService membersService;

    @PostMapping("/api/v1/members")
    public Long save(@RequestBody MembersJoinRequestDto requestDto){
        return membersService.join(requestDto);
    }
}
