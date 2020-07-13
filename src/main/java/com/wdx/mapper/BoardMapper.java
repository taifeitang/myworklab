package com.wdx.mapper;

import com.wdx.entity.Board;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wdx
 * @since 2020-07-13
 */
public interface BoardMapper extends BaseMapper<Board> {
    List<Board> selectAsList();
    int insertList(@Param("list")List<Board> list);
}
