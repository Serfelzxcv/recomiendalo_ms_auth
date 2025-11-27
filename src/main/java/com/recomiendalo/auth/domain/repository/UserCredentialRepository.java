package com.recomiendalo.auth.domain.repository;

import com.recomiendalo.auth.domain.model.UserCredential;
import java.util.Optional;

public interface UserCredentialRepository {

    UserCredential save(UserCredential credential);

    Optional<UserCredential> findByUserId(Long userId);
}
