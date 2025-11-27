package com.recomiendalo.auth.application.mapper;

import com.recomiendalo.auth.domain.model.User;
import com.recomiendalo.auth.domain.model.Role;
import com.recomiendalo.auth.infrastructure.entity.UserEntity;

public class UserMapper {

    public static User toDomain(UserEntity entity) {
        return User.builder()
                .id(entity.getId())
                .email(entity.getEmail())
                .role(Role.valueOf(entity.getRole()))
                .build();
    }

    public static UserEntity toEntity(User domain) {
        return UserEntity.builder()
                .id(domain.getId())
                .email(domain.getEmail())
                .role(domain.getRole().name())
                .build();
    }
}
