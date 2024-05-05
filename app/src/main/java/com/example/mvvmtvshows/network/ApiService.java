package com.example.mvvmtvshows.network;

import com.example.mvvmtvshows.responses.TVShowDetailsResponse;
import com.example.mvvmtvshows.responses.TVShowsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("most-popular")
    Call<TVShowsResponse> getMostPopularTVShow(@Query("page") int page);

    @GET("show-details")
    Call<TVShowDetailsResponse> getTVShowDetail(@Query("q") String tvShowId);

}
