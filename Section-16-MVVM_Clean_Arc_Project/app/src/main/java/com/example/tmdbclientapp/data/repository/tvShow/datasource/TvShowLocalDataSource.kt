package com.example.tmdbclientapp.data.repository.tvShow.datasource

import com.example.tmdbclientapp.data.model.tvshow.TvShow


interface TvShowLocalDataSource {
  suspend fun getTvShowsFromDB():List<TvShow>
  suspend fun saveTvShowsToDB(tvShows:List<TvShow>)
  suspend fun clearAll()
}