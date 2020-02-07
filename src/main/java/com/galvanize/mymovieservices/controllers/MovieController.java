package com.galvanize.mymovieservices.controllers;

import com.galvanize.mymovieservices.entities.Movies;
import com.galvanize.mymovieservices.repositories.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MoviesRepository moviesRepo;

    @GetMapping("/findMovie")
    public List<Movies> findMovie(@RequestParam String title) {
        return  moviesRepo.findMoviesBytitleContains(title);
    }



}
