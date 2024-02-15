package com.octaviocruz.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    // we can talk to the database with a repository but another way is
    // with a template
    @Autowired
    private MongoTemplate mongoTemplate;

    //create review
    public Review createReview(String reviewBody, String imdbId){
        // Review review = new Review(reviewBody);
        // reviewRepository.insert(review);
        Review review = reviewRepository.insert(new Review(reviewBody));

        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review))
                .first();

        return review;
    }

}
