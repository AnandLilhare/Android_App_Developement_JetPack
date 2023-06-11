package com.example.tmdbclientapp.domain.usecases

import com.example.tmdbclientapp.data.model.artist.Artist
import com.example.tmdbclientapp.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun executor():List<Artist>? = artistRepository.updateArtists()
}