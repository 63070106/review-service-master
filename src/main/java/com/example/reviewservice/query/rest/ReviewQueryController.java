package com.example.reviewservice.query.rest;

import com.example.reviewservice.query.FindReviewsQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewQueryController {
    @Autowired
    QueryGateway queryGateway;

    @GetMapping
    public List<ReviewRestModel> getReviews(){
        FindReviewsQuery findReviewsQuery = new FindReviewsQuery();
        List<ReviewRestModel> reviews = queryGateway
                .query(findReviewsQuery, ResponseTypes.multipleInstancesOf(ReviewRestModel.class)).join();
        return reviews;
    }
}
