package com.example.user.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by User on 6/6/2017.
 */

public interface APIServices {

    @GET("be7c81df4024444d2d7d47c89fcd65b5/raw/5929d07929fae8776f795dd810c637be39bc1a6a/mpp.json")
        //@GET("f93b9ef4501fa66367f5e177c955661d/raw/93152986dd95ae861e2ff8aaae8ce2c797825268/movies.json")
    //@GET("asdsadsa.json")
    Call<List<Mpp>> getTitleMpp();

}
