package cn.charlie.strong.service;

import cn.charlie.strong.entity.user.AuthUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author charlie
 * @date 2024/4/29 09:00
 **/
public interface UserService extends IService<AuthUser> {
    /**
     * 新增用户
     *
     * @param authUser
     * @return
     */
    AuthUser createUser(AuthUser authUser);
}
