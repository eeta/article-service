package com.eeta.webzine.board.free.service;

import com.eeta.webzine.board.free.dao.FreeBoardDao;
import com.eeta.webzine.board.free.dto.FreeBoardPostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FreeBoardServiceImpl implements FreeBoardService {

    private final FreeBoardDao freeBoardDao;

    @Override
    public List<FreeBoardPostDto> getFreeBoardList() {
        return freeBoardDao.getFreeBoardList();
    }
}
