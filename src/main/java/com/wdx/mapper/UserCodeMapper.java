package com.wdx.mapper;

import com.wdx.entity.User;
import com.wdx.entity.UserCode;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wdx
 * @since 2020-06-17
 */
@Repository
public interface UserCodeMapper extends BaseMapper<UserCode> {
    int addUserCode(User user, String code);
}
