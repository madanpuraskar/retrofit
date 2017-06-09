package com.example.user.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    public static final String TAG =MainActivity.class.getSimpleName() ;
    TextView tv1,tv2 ,tv3,tv4,tv5,tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
       tv1 = (TextView) findViewById(R.id.title_mpp);
        tv2= (TextView) findViewById(R.id.rating);
        tv3= (TextView) findViewById(R.id.Title);
        tv4= (TextView) findViewById(R.id.Author);
        //tv5= (TextView) findViewById(R.id.author_mpp);
        //tv6= (TextView) findViewById(R.id.author_mpp);
    }


    public void LoadTitle(View view) {

        RetroManager.getInstance().getList(new Callback<List<Mpp>>() {


            @Override
            public void onResponse(Call<List<Mpp>> call, Response<List<Mpp>> response) {
                Log.d(TAG, "onResponse:" + response.body());

                 for (Mpp mpp : response.body()) {


                     Log.d(TAG, "onResponse: " + mpp.getTitle());
                     Log.d(TAG, "onResponse: "+mpp.getAuthor());
                     Log.d(TAG, "onResponse: "+mpp.getPages());
//                    Log.d(TAG, "onResponse: "+mpp.getAuthor());
//                    Log.d(TAG, "onResponse: "+mpp.getPublisher());
//                    Log.d(TAG, "onResponse: "+mpp.getPublisher_Address());
//                    Log.d(TAG, "onResponse: "+mpp.getSubject());
//                    Log.d(TAG, "onResponse: "+mpp.getPages());
//                    Log.d(TAG, "onResponse: "+mpp.getSize());
//                    Log.d(TAG, "onResponse: "+mpp.getEdition());
//                    Log.d(TAG, "onResponse: "+mpp.getPress());
//                    Log.d(TAG, "onResponse: "+mpp.getPress_Address());
//                    Log.d(TAG, "onResponse: "+mpp.getPress_Address());
//                    Log.d(TAG, "onResponse: "+mpp.getPrice());
//                    Log.d(TAG, "onResponse: "+mpp.getPublished_Date());
//                    Log.d(TAG, "onResponse: "+mpp.getISBN());
//                    Log.d(TAG, "onResponse: "+mpp.getRemarks());

                     String a="\n"+mpp.getTitle();
                      String b="\n"+mpp.getPages();
                     String c = "\n"+mpp.getAuthor();;
                     tv4.append(a);
                     tv2.append(b);
                     tv3.append(c);
                 };}
            public void onFailure(Call<List<Mpp>> call, Throwable t) {
            }
        });

        }
    }
