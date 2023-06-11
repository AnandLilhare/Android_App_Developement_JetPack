package com.anushka.tmdbclient.presentation.di.movie


import com.anushka.tmdbclient.presentation.artist.ArtistViewModelFactory
import com.example.tmdbclientapp.domain.usecases.GetMovieUseCase
import com.example.tmdbclientapp.domain.usecases.UpdateMoviesUsecase
import com.example.tmdbclientapp.presentation.movies.MovieViewModelFactory

import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMovieUseCase,
        updateMoviesUsecase: UpdateMoviesUsecase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }

}