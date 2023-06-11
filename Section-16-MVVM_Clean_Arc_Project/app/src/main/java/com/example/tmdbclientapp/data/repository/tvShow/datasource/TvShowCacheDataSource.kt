package com.example.tmdbclientapp.data.repository.tvShow.datasource

import com.example.tmdbclientapp.data.model.tvshow.TvShow


interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(tvShows:List<TvShow>)

}