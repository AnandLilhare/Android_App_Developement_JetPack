package com.anushka.tmdbclient.presentation.di

import com.anushka.tmdbclient.data.api.TMDBService
import com.anushka.tmdbclient.data.repository.artist.datasource.ArtistRemoteDatasource
import com.anushka.tmdbclient.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.anushka.tmdbclient.data.repository.movie.datasource.MovieRemoteDatasource
import com.anushka.tmdbclient.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.anushka.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.anushka.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Provides
import javax.inject.Singleton

class RemoteDataModule(private val apiKey: String) {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService) : MovieRemoteDatasource {
        return  MovieRemoteDataSourceImpl(tmdbService,apiKey)
    }

    @Singleton
    @Provides
    fun provideTvRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDatasource {
        return TvShowRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDatasource {
        return ArtistRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

}