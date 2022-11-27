package com.example.tugas_restapi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPICall {

    //https://run.mocky.io/v3/845f731d-94e6-4f31-b96e-efab61ca84a7

    @GET("v3/845f731d-94e6-4f31-b96e-efab61ca84a7")
    Call<DataModel> getData();
}
