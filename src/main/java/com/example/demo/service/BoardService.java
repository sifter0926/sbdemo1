package com.example.demo.service;

import com.example.demo.dto.BoardDTO;

import java.util.List;

public interface BoardService {
    List<BoardDTO> getList();
    BoardDTO getOne(int bno);
    void register(BoardDTO boardDTO);
    void modify(BoardDTO boardDTO);
    void remove(int bno);
}
