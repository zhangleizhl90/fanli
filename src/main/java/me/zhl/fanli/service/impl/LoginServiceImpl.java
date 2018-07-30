package me.zhl.fanli.service.impl;

import me.zhl.fanli.entity.User;
import me.zhl.fanli.repository.UserRepository;
import me.zhl.fanli.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User login(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }
}
