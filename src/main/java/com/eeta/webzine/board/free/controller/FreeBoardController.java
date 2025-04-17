package com.eeta.webzine.board.free.controller;

import com.eeta.webzine.board.free.dto.FreeBoardPostDto;
import com.eeta.webzine.board.free.service.FreeBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/board/free")
@RequiredArgsConstructor
public class FreeBoardController {

    private final FreeBoardService freeBoardService;

    @GetMapping
    public List<FreeBoardPostDto> getFreeBoardList() {
        return freeBoardService.getFreeBoardList();
    }

}
