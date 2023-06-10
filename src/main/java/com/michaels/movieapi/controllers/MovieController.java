package com.michaels.movieapi.controllers;

import com.michaels.movieapi.entities.MovieEntity;
import com.michaels.movieapi.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movies")
@RequiredArgsConstructor
public class MovieController {


    private final MovieService movieService;

    @GetMapping("/getall")
    public List<MovieEntity> getAllMovies() {
        return movieService.getAllMovies();
    }
    @GetMapping("/getmovies")
    public List<MovieEntity> getMovies(@RequestParam(defaultValue = "1") int page,
                                 @RequestParam(defaultValue = "10") int limit) {
        return movieService.getMovies(page, limit);
    }
    @GetMapping("/getbytitle/{title}")
    public MovieEntity getMovieByTitle(@PathVariable String title) {
        return movieService.getMovieByTitle(title);
    }
    @GetMapping("/getbyid/{id}")
    public Optional<MovieEntity> getMovieById(@PathVariable String id) {
        return movieService.getMovieById(id);
    }
    @PostMapping("/addmovie")
    public void addMovie(@RequestBody MovieEntity movie) {
        movieService.addMovie(movie);
    }

    @PutMapping("/{id}")
    public void updateMovie(@PathVariable String id, @RequestBody MovieEntity movie) {
        movieService.updateMovie(id, movie);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable String id) {
        movieService.deleteMovie(id);
    }
}
