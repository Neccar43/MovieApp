package com.example.movieapp.presentation.movies

sealed class MoviesEvent{
    data class SearchEvent(val search:String):MoviesEvent()
}
