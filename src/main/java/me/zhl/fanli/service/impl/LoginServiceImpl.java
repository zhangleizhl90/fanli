package me.zhl.fanli.service.impl;

import me.zhl.fanli.entity.User;
import me.zhl.fanli.exception.LoginFailedException;
import me.zhl.fanli.repository.UserRepository;
import me.zhl.fanli.service.LoginService;
import me.zhl.fanli.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

    private UserRepository mUserRepository;

    @Autowired
    public LoginServiceImpl(UserRepository userRepository) {
        this.mUserRepository = userRepository;
    }

    @Override
    public String login(String username, String password) throws LoginFailedException {
        User user = mUserRepository.findByUsernameAndPassword(username, password);
        if (user == null) {
            throw new LoginFailedException();
        }
        return generateLoginToken(user);
    }

    @Override
    public User login(String loginToken) throws LoginFailedException {
        if (StringUtil.isEmpty(loginToken)) {
            throw new LoginFailedException();
        }
        return mUserRepository.findByLoginToken(loginToken);
    }

    @Override
    public String generateLoginToken(@NonNull User user) {
        String loginToken = StringUtil.generateUUID32();
        user.setLoginToken(loginToken);
        mUserRepository.save(user);
        return loginToken;
    }
}
