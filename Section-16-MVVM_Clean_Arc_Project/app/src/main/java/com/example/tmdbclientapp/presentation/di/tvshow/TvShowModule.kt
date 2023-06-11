package com.anushka.tmdbclient.presentation.di.tvshow


import com.anushka.tmdbclient.presentation.artist.ArtistViewModelFactory
import com.anushka.tmdbclient.presentation.tv.TvShowViewModelFactory
import com.example.tmdbclientapp.domain.usecases.GetTvShowsUseCase
import com.example.tmdbclientapp.domain.usecases.UpdateTvShowsUseCase
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}