package com.bhhan.springsecurity.domain.user;

import lombok.Getter;

/**
 * Created by hbh5274@gmail.com on 2020-02-12
 * Github : http://github.com/bhhan5274
 */

@Getter
public enum Role {
    ADMIN("ROLE_ADMIN"),
    MEMBER("ROLE_MEMBER");

    Role(String role){
        this.value = role;
    }

    private String value;
}
