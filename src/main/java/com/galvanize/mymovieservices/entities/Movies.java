package com.galvanize.mymovieservices.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "movies")

public class Movies implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id", insertable = false, nullable = false)
    private Long movieId;

    @Column(name = "actors")
    private String actors;

    @Column(name = "awards")
    private String awards;

    @Column(name = "boxoffice")
    private String boxoffice;

    @Column(name = "country")
    private String country;

    @Column(name = "dvd")
    private Date dvd;

    @Column(name = "director")
    private String director;

    @Column(name = "genre")
    private String genre;

    @Column(name = "language")
    private String language;

    @Column(name = "metascore")
    private String metascore;

    @Column(name = "plot")
    private String plot;

    @Column(name = "poster")
    private String poster;

    @Column(name = "production")
    private String production;

    @Column(name = "rated")
    private String rated;

    @Column(name = "released")
    private Date released;

    @Column(name = "response")
    private String response;

    @Column(name = "runtime")
    private String runtime;

    @Column(name = "type")
    private String type;

    @Column(name = "website")
    private String website;

    @Column(name = "writer")
    private String writer;

    @Column(name = "year")
    private String year;

    @Column(name = "imdb_rating")
    private String imdbRating;

    @Column(name = "imdb_votes")
    private String imdbVotes;

    @Column(name = "imdbid")
    private String imdbid;

    @Column(name = "title")
    private String title;

}
