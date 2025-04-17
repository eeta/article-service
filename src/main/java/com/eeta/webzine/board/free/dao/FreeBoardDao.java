package com.eeta.webzine.board.free.dao;

import com.eeta.webzine.board.free.dto.FreeBoardPostDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FreeBoardDao {
    List<FreeBoardPostDto> getFreeBoardList();
}
