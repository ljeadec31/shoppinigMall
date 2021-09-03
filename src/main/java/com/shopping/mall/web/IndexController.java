package com.shopping.mall.web;

import com.shopping.mall.service.members.MembersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final MembersService membersService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("members",membersService.findAllDesc());
        return "index";
    }

    @GetMapping("/member/login")
    public String memberLogin(){
        return "member-login";
    }

    @GetMapping("/member/join")
    public String memberJoin(){
        return "member-join";
    }

}
