package com.example.movieapp.domain.repository

import com.example.movieapp.data.remote.dto.MovieDetailDto
import com.example.movieapp.data.remote.dto.MoviesDto

interface MovieRepository {

    suspend fun getMovies(searchString: String):MoviesDto
    suspend fun getMovieDetail(imdbId:String):MovieDetailDto
}