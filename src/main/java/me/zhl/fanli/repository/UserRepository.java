package me.zhl.fanli.repository;

import me.zhl.fanli.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM user WHERE username = ?1 AND password = ?2", nativeQuery = true)
    User findByUsernameAndPassword(String username, String password);
}
