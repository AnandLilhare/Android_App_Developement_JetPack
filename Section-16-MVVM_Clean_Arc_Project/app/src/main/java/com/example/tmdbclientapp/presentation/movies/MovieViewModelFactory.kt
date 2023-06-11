package com.example.tmdbclientapp.presentation.movies

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.tmdbclientapp.domain.usecases.GetMovieUseCase
import com.example.tmdbclientapp.domain.usecases.UpdateMoviesUsecase

class MovieViewModelFactory(
    private val getMoviesUseCase: GetMovieUseCase,
    private val updateMoviesUsecase: UpdateMoviesUsecase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MovieViewModel(getMoviesUseCase,updateMoviesUsecase) as T
    }
}