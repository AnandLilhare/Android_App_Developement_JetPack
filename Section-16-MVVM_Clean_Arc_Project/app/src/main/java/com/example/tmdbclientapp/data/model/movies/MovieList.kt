package com.example.tmdbclientapp.data.model.movies


import com.example.tmdbclientapp.data.model.movies.Movie
import com.google.gson.annotations.SerializedName

data class MovieList(

    @SerializedName("results")
    val movies: List<Movie>,

    )