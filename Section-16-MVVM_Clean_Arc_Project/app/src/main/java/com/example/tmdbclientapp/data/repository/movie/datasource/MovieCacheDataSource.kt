package com.example.tmdbclientapp.data.repository.movie.datasource

import com.example.tmdbclientapp.data.model.movies.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies:List<Movie>)

}