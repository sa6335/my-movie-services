package com.galvanize.mymovieservices.controllers;

import com.galvanize.mymovieservices.entities.Movies;
import com.galvanize.mymovieservices.services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No movies found")  // 404
class MovieNotFound extends RuntimeException {
    // ...
}

@RestController
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    MoviesService mService;

  /*  @GetMapping("/error")
    private String error() {
        return "No movies found.";
    } */

    @GetMapping("/find")
    public List<Movies> findMovie(@RequestParam String title) {
        List<Movies> movies = mService.findMoviesByTitleContains(title);
        if (movies.size() == 0) throw new MovieNotFound();
        return movies;
    }
}
