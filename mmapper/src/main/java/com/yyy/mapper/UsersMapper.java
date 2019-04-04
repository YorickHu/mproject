package com.yyy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yyy.comm.Users;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author yyy
 * @since 2019-03-31
 */
@Mapper/*notes：加了这个Mapper才能正常注入*/
public interface UsersMapper extends BaseMapper<Users> {

}
