package com.example.tmdbclientapp.presentation.di.core


import com.example.tmdbclientapp.data.repository.artist.ArtistRepositoryImpl
import com.example.tmdbclientapp.data.repository.artist.datasource.ArtistCacheDataSource
import com.example.tmdbclientapp.data.repository.artist.datasource.ArtistLocalDataSource
import com.example.tmdbclientapp.data.repository.artist.datasource.ArtistRemoteDatasource
import com.example.tmdbclientapp.data.repository.movie.MovieRepositoryImpl
import com.example.tmdbclientapp.data.repository.movie.datasource.MovieCacheDataSource
import com.example.tmdbclientapp.data.repository.movie.datasource.MovieLocalDataSource
import com.example.tmdbclientapp.data.repository.movie.datasource.MovieRemoteDatasource
import com.example.tmdbclientapp.data.repository.tvShow.TvShowRepositoryImpl
import com.example.tmdbclientapp.data.repository.tvShow.datasource.TvShowCacheDataSource
import com.example.tmdbclientapp.data.repository.tvShow.datasource.TvShowLocalDataSource
import com.example.tmdbclientapp.data.repository.tvShow.datasource.TvShowRemoteDatasource
import com.example.tmdbclientapp.domain.repository.ArtistRepository
import com.example.tmdbclientapp.domain.repository.MovieRepository
import com.example.tmdbclientapp.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {

        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )


    }

}