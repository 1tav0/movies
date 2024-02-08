package com.octaviocruz.movies;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")  //let the framework know this is a document class
public class Movie {
}
