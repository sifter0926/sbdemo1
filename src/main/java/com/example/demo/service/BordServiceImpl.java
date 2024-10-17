package com.example.demo.service;

import com.example.demo.dto.BoardDTO;
import com.example.demo.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Log4j2
@RequiredArgsConstructor
public class BordServiceImpl implements BoardService{
    private final BoardMapper boardMapper;

    @Override
    public List<BoardDTO> getList() {
        return boardMapper.selectAll();
    }

    @Override
    public BoardDTO getOne(int bno) {
        boardMapper.visitCountUpdate(bno);
        return boardMapper.selectOne(bno);
    }

    @Override
    public void register(BoardDTO boardDTO) {
        boardMapper.insert(boardDTO);
    }

    @Override
    public void modify(BoardDTO boardDTO) {
        BoardDTO dto=boardMapper.selectOne(boardDTO.getBno());
        boardMapper.update(boardDTO);

    }

    @Override
    public void remove(int bno) {
        boardMapper.delete(bno);
    }
}
