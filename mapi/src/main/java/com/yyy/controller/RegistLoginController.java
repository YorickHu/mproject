package com.yyy.controller;

import com.yyy.comm.IMoocJSONResult;
import com.yyy.comm.Users;
import com.yyy.comm.vo.UsersVO;
import com.yyy.crypt.CryptUtils;
import com.yyy.service.UsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.n3r.idworker.Sid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName RegistLoginController
 * @Description TODO
 * @Author huyue
 * @Date 2019/3/30 5:58 PM
 * @Version 1.0
 **/
@RestController/*notes：@RestController注解，相当于@Controller+@ResponseBody两个注解的结合，返回json数据不需要在方法前面加@ResponseBody注解了，但使用@RestController这个注解，就不能返回jsp,html页面，视图解析器无法解析jsp,html页面*/
@Api(value="用户注册登录的接口", tags= {"注册和登录的controller"})/*notes：swagger使用*/
public class RegistLoginController {
/*notes：controller调用service；json前后端通信；上下行类；生成id工具*/

    @Autowired
    UsersService usersService;

    @Autowired
    Sid sid;

    @ApiOperation(value="用户注册", notes="用户注册的接口")/*notes：swagger使用*/
    @PostMapping("/regist")/*notes：只接受post*/
    public IMoocJSONResult regist(@RequestBody Users user) throws Exception {/*notes：@RequestBody 接收Json格式的数据需要加这个注解。该注解不能接收URL、Form表单传参*/
        // 1. 判断用户名和密码必须不为空
        // TODO：有没有更好的校验方式？
        if (StringUtils.isEmpty(user.getLoginName()) || StringUtils.isEmpty(user.getPwd())) {
            return IMoocJSONResult.errorMsg("用户名和密码不能为空");
        }

        // 2. 判断用户名是否存在
        boolean usernameIsExist = usersService.queryUsernameIsExist(user.getLoginName());

        // 3. 保存用户，注册信息
        if (!usernameIsExist) {
            user.setLoginName(user.getLoginName());
            user.setPwd(CryptUtils.getMD5Str(user.getPwd()));
            user.setId(sid.nextShort());
            usersService.save(user);
        } else {
            return IMoocJSONResult.errorMsg("用户名已经存在，请换一个再试");
        }

        // 返回
        UsersVO userVO = new UsersVO();
		BeanUtils.copyProperties(user, userVO);
		return IMoocJSONResult.ok(userVO);
    }


}
