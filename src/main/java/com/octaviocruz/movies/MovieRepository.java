package com.octaviocruz.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

// to be able to pull data from the db to make use of our movie model
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
}
