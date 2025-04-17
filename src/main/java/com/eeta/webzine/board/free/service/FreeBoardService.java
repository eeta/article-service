package com.eeta.webzine.board.free.service;

import com.eeta.webzine.board.free.dto.FreeBoardPostDto;

import java.util.List;

public interface FreeBoardService {
    List<FreeBoardPostDto> getFreeBoardList();
}
