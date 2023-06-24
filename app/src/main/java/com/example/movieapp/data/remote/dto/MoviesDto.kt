package com.example.movieapp.data.remote.dto

import com.example.movieapp.domain.model.Movie

data class MoviesDto(
    val Response: String,
    val Search: List<Search>,
    val totalResults: String
)
//Sadece kullanacağımız verileri alıp domain altındaki model data class ına çeviriyoruz
fun MoviesDto.toMovieList():List<Movie>{
    return Search.map { search -> Movie(search.Poster,search.Title,search.Year,search.imdbID) }
}