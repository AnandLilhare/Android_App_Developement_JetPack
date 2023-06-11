package com.anushka.tmdbclient.data.repository.tvshow.datasourceImpl


import com.example.tmdbclientapp.data.repository.tvShow.datasource.TvShowRemoteDatasource
import com.example.tmdbclientapp.data.api.TMDBService
import com.example.tmdbclientapp.data.model.tvshow.TvShowList
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): TvShowRemoteDatasource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}

