package com.example.tmdbclientapp.presentation.movies

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.tmdbclientapp.domain.usecases.GetMovieUseCase
import com.example.tmdbclientapp.domain.usecases.UpdateMoviesUsecase

class MovieViewModel(
    private val getMoviesUseCase: GetMovieUseCase,
    private val updateMoviesUsecase: UpdateMoviesUsecase
): ViewModel() {

    fun getMovies() = liveData {
        val movieList = getMoviesUseCase.execute()
        emit(movieList)
    }
    fun updateMovies() = liveData {
        val movieList = updateMoviesUsecase.execute()
        emit(movieList)
    }
}