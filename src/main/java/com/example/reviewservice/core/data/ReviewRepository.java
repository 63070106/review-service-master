package com.example.reviewservice.core.data;

import com.example.reviewservice.core.ReviewEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<ReviewEntity, String> {
    ReviewEntity findByReviewId(String reviewId);
    ReviewEntity findByReviewIdOrName(String reviewId, String name);
}
