package com.octaviocruz.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

// This is our movie model
@Document(collection = "movies")  //let the framework know this is a document class
@Data // make use of lombok package, this class is a data class
@AllArgsConstructor // that is able to create an object with a constructor with all those args
@NoArgsConstructor // that can also make an object without any parameters
public class Movie {
    @Id // let framework know this is a unique type of id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseData;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference
    private List<Review> reviewIds;
}
