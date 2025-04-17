package com.eeta.webzine.board.free.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class FreeBoardPostDto {
    private Long postId;
    private Long menuId;
    private Long parentId;
    private Long userId;
    private String title;
    private String content;
    private Long viewCount;
    private Long commentCount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
