package com.stackroute.movieboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.movieboot.domain.Movie;

//learn Inheritence
@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {
	public Movie getByMovieTitle(String movieTitle);

	public Movie getByMovieRating(int movieRating);
	// @Query("select m from Movie m where m.movieTitle like :movieName%")
	// public List<Movie> getByMovieName(@Param("movieName") String movieTitle);
}