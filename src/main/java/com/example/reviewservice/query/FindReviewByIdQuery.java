package com.example.reviewservice.query;

import lombok.Data;

@Data
public class FindReviewByIdQuery {
    private String reviewId;

    public FindReviewByIdQuery(String reviewId){
        this.reviewId = reviewId;
    }
}
