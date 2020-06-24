package com.wdx.mapper;

import com.wdx.entity.Bs;
import com.wdx.entity.Stock;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wdx
 * @since 2020-06-16
 */
@Repository
public interface StockMapper extends BaseMapper<Stock> {
    List<Stock> getList();
    Map getId(Long id);
    Map getById(@Param("id") Long sid);
    Bs get(Long sid);
    int updateStock(String price,String sid);
    int saveStock(Stock stock);
}
