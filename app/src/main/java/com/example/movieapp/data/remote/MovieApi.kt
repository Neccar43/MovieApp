package com.example.movieapp.data.remote

import com.example.movieapp.data.remote.dto.MovieDetailDto
import com.example.movieapp.data.remote.dto.MoviesDto
import com.example.movieapp.util.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {
    //https://www.omdbapi.com/?apikey=3a7692af&s=batman
    //https://www.omdbapi.com/?apikey=3a7692af&i=tt0372784

    //end point yoksa "." koyuyoruz
    @GET(".")
    suspend fun getMovies(
        @Query("s") searchString: String,
        @Query("apikey") apiKey: String = API_KEY
    ):MoviesDto

    @GET(".")
    suspend fun getMovieDetail(
        @Query("i") imdbId: String,
        @Query("apikey") apiKey: String = API_KEY
    ):MovieDetailDto

}