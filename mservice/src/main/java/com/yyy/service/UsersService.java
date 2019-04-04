package com.yyy.service;

import com.yyy.comm.Users;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author yyy
 * @since 2019-03-31
 */
public interface UsersService extends IService<Users> {
    /**
     * @Description: 判断用户名是否存在
     */
    public boolean queryUsernameIsExist(String username);

}
