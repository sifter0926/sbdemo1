package com.example.demo.mapper;

import com.example.demo.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BoardMapper {
    List<BoardDTO> selectAll();
    BoardDTO selectOne(int bno);
    void insert(BoardDTO board);
    void update(BoardDTO board);
    void delete(int bno);
    void visitCountUpdate(int bno);
}
