package com.otakumap.domain.place_short_review.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class PlaceShortReviewResponseDTO {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CreateReviewDTO {
        private Long reviewId;
        private Integer rating;
        private String content;
        private LocalDateTime createdAt;
        private Long userId;
        private String nickname;
//        private String profilePicture;
    }
}