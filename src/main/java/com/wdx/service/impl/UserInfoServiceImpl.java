package com.wdx.service.impl;

import com.wdx.entity.UserInfo;
import com.wdx.mapper.UserInfoMapper;
import com.wdx.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 医疗板块用户信息表 服务实现类
 * </p>
 *
 * @author wdx
 * @since 2020-06-15
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
