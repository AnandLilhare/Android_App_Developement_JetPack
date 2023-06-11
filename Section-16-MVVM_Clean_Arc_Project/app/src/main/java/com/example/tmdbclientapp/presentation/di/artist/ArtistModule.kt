package com.anushka.tmdbclient.presentation.di.artist


import com.anushka.tmdbclient.presentation.artist.ArtistViewModelFactory
import com.example.tmdbclientapp.domain.usecases.GetArtistsUseCase
import com.example.tmdbclientapp.domain.usecases.UpdateArtistsUseCase
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }

}