package com.onlinemovies.store.Online.Movie.Store.repository;

import com.onlinemovies.store.Online.Movie.Store.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

    Movie findByName(String name);
}
