package com.bhhan.springsecurity.domain.user;

import com.bhhan.springsecurity.domain.common.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * Created by hbh5274@gmail.com on 2020-02-12
 * Github : http://github.com/bhhan5274
 */

@Entity
@Table(name = "USERS")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class UserEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;

    @Column(length = 30)
    @Email
    private String username;

    @NotBlank
    private String password;

    @Builder
    public UserEntity(String email, String password){
        this.username = email;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
