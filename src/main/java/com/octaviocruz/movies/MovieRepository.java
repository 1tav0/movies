package com.octaviocruz.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// to be able to pull data from the db to make use of our movie model
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // since we will be using the imdbId of the movie to find it and mongodb doesn't have that built-in function we
    // will need to make one ourselves
    // aka dynamic query
    Optional<Movie> findMovieByImdbId(String imdbId); //Spring data mongodb is smart to understand what we mean with this
}
