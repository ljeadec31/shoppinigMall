package com.shopping.mall.domain.members;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Members {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

    @Column(length = 500, nullable = false)
    private String lg_id;

    @Column(length = 500, nullable = false)
    private String pw;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String email;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String addr;

    @Builder
    public Members(String lg_id, String pw, String name, String email, String addr){
        this.lg_id=lg_id;
        this.pw=pw;
        this.name=name;
        this.email=email;
        this.addr=addr;
    }
}
