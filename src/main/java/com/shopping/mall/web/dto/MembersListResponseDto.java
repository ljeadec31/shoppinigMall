package com.shopping.mall.web.dto;

import com.shopping.mall.domain.members.Members;
import lombok.Getter;

@Getter
public class MembersListResponseDto {
    private Long id;
    private String lg_id;
    private String name;
    private String pw;
    private String email;
    private String addr;

    public MembersListResponseDto(Members entity){
        this.id=entity.getId();
        this.lg_id= entity.getLg_id();
        this.name= entity.getName();
        this.pw= entity.getPw();
        this.email= entity.getEmail();
        this.addr= entity.getAddr();
    }
}
