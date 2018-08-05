package me.zhl.fanli.service.impl;

import me.zhl.fanli.entity.User;
import me.zhl.fanli.repository.UserRepository;
import me.zhl.fanli.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RegisterServiceImpl implements RegisterService {

    private UserRepository mUserRepository;

    @Autowired
    public RegisterServiceImpl(UserRepository userRepository) {
        this.mUserRepository = userRepository;
    }

    @Override
    public User registerByPassword(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        mUserRepository.save(user);
        return user;
    }
}
