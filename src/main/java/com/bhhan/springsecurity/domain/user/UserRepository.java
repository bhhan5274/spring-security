package com.bhhan.springsecurity.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by hbh5274@gmail.com on 2020-02-12
 * Github : http://github.com/bhhan5274
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String email);
}
