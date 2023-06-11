package com.example.tmdbclientapp.presentation.di.core


import com.example.tmdbclientapp.domain.repository.ArtistRepository
import com.example.tmdbclientapp.domain.repository.MovieRepository
import com.example.tmdbclientapp.domain.repository.TvShowRepository
import com.example.tmdbclientapp.domain.usecases.*
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideGetMovieUseCase(movieRepository: MovieRepository):GetMovieUseCase{
        return GetMovieUseCase(movieRepository)
    }
    @Provides
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository): UpdateMoviesUsecase {
        return UpdateMoviesUsecase(movieRepository)
    }

    @Provides
    fun provideGetTvShowUseCase(tvShowRepository: TvShowRepository): GetTvShowsUseCase {
        return GetTvShowsUseCase(tvShowRepository)
    }
    @Provides
    fun provideUpdateTvShowUseCase(tvShowRepository: TvShowRepository): UpdateTvShowsUseCase {
        return UpdateTvShowsUseCase(tvShowRepository)
    }

    @Provides
    fun provideGetArtistUseCase(artistRepository: ArtistRepository): GetArtistsUseCase {
        return GetArtistsUseCase(artistRepository)
    }
    @Provides
    fun provideUpdateArtistUseCase(artistRepository: ArtistRepository):UpdateArtistsUseCase{
        return UpdateArtistsUseCase(artistRepository)
    }

}