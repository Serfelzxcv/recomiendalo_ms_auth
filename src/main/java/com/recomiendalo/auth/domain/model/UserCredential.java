package com.recomiendalo.auth.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class UserCredential {

    private Long id;
    private Long userId;
    private String passwordHash;
    private boolean active;
}
