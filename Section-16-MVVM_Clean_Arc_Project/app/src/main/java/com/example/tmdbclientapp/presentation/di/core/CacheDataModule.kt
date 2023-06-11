package com.example.tmdbclientapp.presentation.di.core


import com.anushka.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import com.anushka.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import com.example.tmdbclientapp.data.repository.artist.datasource.ArtistCacheDataSource
import com.example.tmdbclientapp.data.repository.artist.datasourceImp.ArtistCacheDataSourceImpl
import com.example.tmdbclientapp.data.repository.movie.datasource.MovieCacheDataSource
import com.example.tmdbclientapp.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.example.tmdbclientapp.data.repository.tvShow.datasource.TvShowCacheDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }


}