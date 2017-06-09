//package com.example.user.retrofit;
//
//
//import android.app.Activity;
//import android.content.Context;
//import android.content.Intent;
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.graphics.drawable.BitmapDrawable;
//import android.graphics.drawable.Drawable;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.GridView;
//import android.widget.ImageView;
//
//import java.nio.ByteBuffer;
//import java.util.ArrayList;
//
//public class Book extends AppCompatActivity {
//    GridView gvn;
//    Context context;
//
//    public static String[] booklist
//    public static int[] booksrc = {};
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_book);
//        gvn = (GridView) findViewById(R.id.gridView1);
//        gvn.setAdapter(new BookCustomAdapter(this, booklist, booksrc));
//
//        gvn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> view, View cell, int position, long id) {
//
//                Intent myIntent = new Intent(Book.this, SingleView.class);
//                Bundle bundle = new Bundle();
//                bundle.putInt("image", booksrc[position]); //image5 or any image
//                myIntent.putExtra("id1",booklist[position]);
//                myIntent.putExtras(bundle);
//                startActivity(myIntent);
//            }
//        });
//    }
//}