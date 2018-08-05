package me.zhl.fanli.repository;

import me.zhl.fanli.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM users WHERE username = ?1 AND password = ?2", nativeQuery = true)
    User findByUsernameAndPassword(String username, String password);

    @Query(value = "SELECT * FROM users WHERE login_token = ?1", nativeQuery = true)
    User findByLoginToken(String loginToken);

//    @Modifying
//    @Query(value = "UPDATE User u SET u.loginToken = :loginToken")
//    int updateLoginToken(@Param("loginToken") String loginToken);
}
