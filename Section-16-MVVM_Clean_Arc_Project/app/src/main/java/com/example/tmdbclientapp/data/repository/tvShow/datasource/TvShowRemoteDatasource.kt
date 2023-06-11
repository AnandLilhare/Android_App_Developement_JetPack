package com.example.tmdbclientapp.data.repository.tvShow.datasource


import com.example.tmdbclientapp.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
   suspend fun getTvShows(): Response<TvShowList>
}