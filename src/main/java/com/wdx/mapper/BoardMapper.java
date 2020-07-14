package com.wdx.mapper;

import com.wdx.entity.Board;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wdx.entity.BoardCopy;
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
    int updateBoard(Board board);
    int updateBoardCopy(Board board);
    BoardCopy getBoard(String boardName, String address);
    BoardCopy getBoard2(String boardName, String address,String version);
    BoardCopy getBoard2(Board board);
    int updateCopy(Board board);
    int updateCopy2(Board board);
    int insertBoardCopy(List<Board> list);
    int insertBoardCopy2(@Param("ls") List<Board> ls);
    List<Board> selectIn(@Param("l") List<Integer>list);
    List <Integer>selectAllId();
    int insertBySelect();
}
