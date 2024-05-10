package cn.charlie.strong.service.impl;

import cn.charlie.strong.config.DbUserDetailsManager;
import cn.charlie.strong.entity.user.AuthUser;
import cn.charlie.strong.mapper.UserMapper;
import cn.charlie.strong.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author charlie
 * @date 2024/4/29 09:01
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, AuthUser> implements UserService {

    @Autowired
    private DbUserDetailsManager dbUserDetailsManager;

    @Override
    public AuthUser createUser(AuthUser authUser) {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        UserDetails user = User.withUsername(authUser.getUsername())
                .password(encoder.encode(authUser.getPassword()))
                .roles("ADMIN")
                .build();
        dbUserDetailsManager.createUser(user);
        return authUser;
    }
}
