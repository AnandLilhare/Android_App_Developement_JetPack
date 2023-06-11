package com.example.tmdbclientapp.presentation.di.core


import com.anushka.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import com.example.tmdbclientapp.data.api.TMDBService
import com.example.tmdbclientapp.data.repository.artist.datasource.ArtistRemoteDatasource
import com.example.tmdbclientapp.data.repository.artist.datasourceImp.ArtistRemoteDataSourceImpl
import com.example.tmdbclientapp.data.repository.movie.datasource.MovieRemoteDatasource
import com.example.tmdbclientapp.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.example.tmdbclientapp.data.repository.tvShow.datasource.TvShowRemoteDatasource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDatasource {
        return MovieRemoteDataSourceImpl(
            tmdbService, apiKey
        )
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