package com.onlinemovies.store.Online.Movie.Store.controller;

import com.onlinemovies.store.Online.Movie.Store.entity.Movie;
import com.onlinemovies.store.Online.Movie.Store.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie){
        return movieService.saveMovie(movie);
    }

    @PostMapping("/addListOfMovies")
    public List <Movie> addMovies(@RequestBody List <Movie> movies){
        return movieService.saveMovies(movies);
    }

    @GetMapping("/showMovies")
    public List<Movie> findAllMovies(){
        return movieService.getMovies();
    }

    @GetMapping("/showMovie/{movieId}")
    public Movie findMovieById(@PathVariable int movieId){
        return movieService.getMovieById(movieId);
    }

    @GetMapping("/showMovieByName/{name}")
    public Movie findMovieByName(@PathVariable String name){
        return movieService.getMovieByName(name);
    }

    @PutMapping("/updateMovie")
    public Movie updateMovie(@RequestBody Movie movie){
        return movieService.updateMovie(movie);
    }

    @DeleteMapping("/deleteMovie/{id}")
    public String deleteMovie(@PathVariable int id){
        return movieService.deleteMovie(id);
    }

}
