package com.shopping.mall.web.dto;

import com.shopping.mall.domain.members.Members;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MembersJoinRequestDto {
    private String lg_id;
    private String name;
    private String pw;
    private String email;
    private String addr;

    @Builder
    public MembersJoinRequestDto(String lg_id, String pw, String name, String email, String addr){
        this.lg_id=lg_id;
        this.pw=pw;
        this.name=name;
        this.email=email;
        this.addr=addr;
    }

    public Members toEntity(){
        return Members.builder()
                .lg_id(lg_id)
                .pw(pw)
                .name(name)
                .email(email)
                .addr(addr)
                .build();
    }
}
