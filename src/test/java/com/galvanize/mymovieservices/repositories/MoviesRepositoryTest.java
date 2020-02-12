package com.galvanize.mymovieservices.repositories;

import com.galvanize.mymovieservices.entities.Movies;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MoviesRepositoryTest {

    @Autowired
    MoviesRepository movieRepo;

    @Test
    void findMoviesByTitleContainsSomething() {
        List<Movies> allTitle = movieRepo.findMoviesByTitleContains("Star");
        assertTrue(allTitle.size()>0);
    }

    @Test
    void findMoviesByTitleContainsNotfound() {
        List<Movies> allTitle = movieRepo.findMoviesByTitleContains("123455555");
        assertTrue(allTitle.size()==0);
    }


}