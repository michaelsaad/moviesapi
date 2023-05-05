package com.michaels.movieapi.repositores;

import com.michaels.movieapi.entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, String> {
    MovieEntity findByTitle(String title);
   /*
   kan feh coflict 3l4an nset a4yrha mn JpaRepository<MovieEntity, Long> l JpaRepository<MovieEntity, String> xdddddddddddd
    enha al mo5drat
    @Transactional
    @Modifying
    @Query("delete from MovieEntity m where m.id =  :id")
    void deleteById(String id);
    Optional<MovieEntity> findById(String id);*/

}
