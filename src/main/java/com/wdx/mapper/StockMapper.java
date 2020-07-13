package com.wdx.mapper;

import com.wdx.entity.Stock;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wdx
 * @since 2020-07-13
 */

public interface StockMapper extends BaseMapper<Stock> {
    List getList();
}
