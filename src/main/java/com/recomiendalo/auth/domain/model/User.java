package com.recomiendalo.auth.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class User {

    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    private Role role;

    private boolean active;

    private String createdAt;
    private String updatedAt;
}
