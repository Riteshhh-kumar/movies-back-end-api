package com.projects.moviesx;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	@Autowired
	private MovieRepository repository;
	
	public List<Movie> allMovies() {
		System.out.print(repository.findAll() + "  ");
		return repository.findAll();
		
	}
	
	public Optional<Movie> singleMovie(String id) {
		return repository.findMovieByImdbId(id);
	}
}
