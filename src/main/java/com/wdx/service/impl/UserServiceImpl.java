package com.wdx.service.impl;

import com.wdx.entity.User;
import com.wdx.mapper.UserMapper;
import com.wdx.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wdx
 * @since 2020-06-17
 */
@Service
public class UserServiceImpl  implements UserService {
     public JSONObject getJ(JSONObject resp){
         resp.put("name","引用传递");
         return resp;
     }

}
