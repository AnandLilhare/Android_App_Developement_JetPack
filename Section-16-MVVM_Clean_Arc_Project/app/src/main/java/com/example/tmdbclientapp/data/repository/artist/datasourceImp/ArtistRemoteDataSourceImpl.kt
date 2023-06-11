package com.example.tmdbclientapp.data.repository.artist.datasourceImp

import com.example.tmdbclientapp.data.api.TMDBService
import com.example.tmdbclientapp.data.model.artist.ArtistList
import com.example.tmdbclientapp.data.repository.artist.datasource.ArtistRemoteDatasource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): ArtistRemoteDatasource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}
