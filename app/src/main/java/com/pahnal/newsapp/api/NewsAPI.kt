package com.pahnal.newsapp.api

import com.pahnal.newsapp.models.NewsResponse
import com.pahnal.newsapp.utils.Constants.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "id",
        @Query("page")
        page: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY,
    ) : Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery: String,
        @Query("page")
        page: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY,
    ) : Response<NewsResponse>
}