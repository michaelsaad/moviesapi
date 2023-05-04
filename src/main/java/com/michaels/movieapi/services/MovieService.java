package com.michaels.movieapi.services;

import com.michaels.movieapi.entities.MovieEntity;
import com.michaels.movieapi.repositores.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<MovieEntity> getAllMovies() {
        return this.movieRepository.findAll();
    }

    public MovieEntity getMovieByTitle(String title) {
        return movieRepository.findByTitle(title);
    }
    public Optional<MovieEntity> getMovieById(String id) {
        return movieRepository.findById(id);
    }
    public void addMovie(MovieEntity movie) {
        movieRepository.save(movie);
    }

    public void updateMovie(String id, MovieEntity movie) {
        Optional<MovieEntity> movieOptional = movieRepository.findById(id);
        if (movieOptional.isPresent()) {
            MovieEntity movieEntity = movieOptional.get();
            movieEntity.setTitle(movie.getTitle());
            movieEntity.setDirector(movie.getDirector());
            movieEntity.setReleaseYear(movie.getReleaseYear());
            movieRepository.save(movieEntity);
        }

    }
    public void deleteMovie(String id) {
        movieRepository.deleteById(id);
    }

}
