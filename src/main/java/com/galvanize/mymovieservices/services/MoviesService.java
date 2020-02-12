package com.galvanize.mymovieservices.services;

import com.galvanize.mymovieservices.entities.Movies;
import com.galvanize.mymovieservices.repositories.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class MoviesService {

    private MoviesRepository mRepo;

    @Autowired
    public void MoviesService(MoviesRepository repo) {
        this.mRepo = repo;
    }

    public List<Movies> findMoviesByTitleContains(String title) {
        return mRepo.findMoviesByTitleContains(title);
    }


}
