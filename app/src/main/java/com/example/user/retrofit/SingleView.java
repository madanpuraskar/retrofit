package com.example.user.retrofit;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleView extends AppCompatActivity{
    TextView t;
    ImageView j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_book);
        Intent i = getIntent();
        j = (ImageView)findViewById(R.id.imgview);
        t = (TextView) findViewById(R.id.tv1);
        t.setText(i.getStringExtra("id1"));
        Bundle bundle = this.getIntent().getExtras();
        int pic = bundle.getInt("image");
        j.setImageResource(pic);
    }


}
