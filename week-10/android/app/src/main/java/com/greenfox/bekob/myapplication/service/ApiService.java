package com.greenfox.bekob.myapplication.service;

import com.greenfox.bekob.myapplication.model.Message;
import com.greenfox.bekob.myapplication.model.Received;
import com.greenfox.bekob.myapplication.model.Status;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by bekob on 2017-11-16.
 */

public interface ApiService {
    @GET("/api/messages")
    Call<Received> getMessages();

    @POST("/api/messages")
    Call<Status> postMessage(@Body Message message);
}
