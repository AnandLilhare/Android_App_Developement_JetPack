package com.anushka.tmdbclient.presentation.tv

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.tmdbclientapp.domain.usecases.GetTvShowsUseCase
import com.example.tmdbclientapp.domain.usecases.UpdateTvShowsUseCase


class TvShowViewModelFactory(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val updateTvShowsUseCase: UpdateTvShowsUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TvShowViewModel(
            getTvShowsUseCase,
            updateTvShowsUseCase
        ) as T
    }
}