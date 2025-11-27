package com.recomiendalo.auth.domain.repository;

import com.recomiendalo.auth.domain.model.User;
import java.util.Optional;

public interface UserRepository {
    Optional<User> findByEmail(String email);
    User save(User user);
}
