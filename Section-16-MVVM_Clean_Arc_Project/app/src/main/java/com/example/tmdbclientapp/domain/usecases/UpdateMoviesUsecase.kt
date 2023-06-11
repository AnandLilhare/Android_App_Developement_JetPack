package com.example.tmdbclientapp.domain.usecases

import com.example.tmdbclientapp.data.model.movies.Movie
import com.example.tmdbclientapp.domain.repository.MovieRepository

class UpdateMoviesUsecase(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.updateMovies()
}