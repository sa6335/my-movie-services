package com.galvanize.mymovieservices.repositories;

import com.galvanize.mymovieservices.entities.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Long> {
    List<Movies> findMoviesByTitleContains(String title);
}