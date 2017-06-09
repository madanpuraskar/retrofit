package com.example.user.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by User on 6/6/2017.
 */

public class RetroManager {

    private static RetroManager retroManager;
    private final String BASE_URL="https://gist.github.com/AashutoshPoudel/";
    Retrofit retrofit;
    APIServices apiServices;

   public static RetroManager getInstance(){
        if(retroManager==null){
            retroManager=new RetroManager();
        }

       return retroManager;
    }

    RetroManager(){

        retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        apiServices =  retrofit.create(APIServices.class);

    }
    public void getList(Callback<List<Mpp>> Callback){
        Call<List<Mpp>> call= apiServices.getTitleMpp();
        call.enqueue(Callback);
    }
}
