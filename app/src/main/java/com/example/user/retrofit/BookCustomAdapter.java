package com.example.user.retrofit;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class BookCustomAdapter extends BaseAdapter {
    private Context acontext;
    private final String[] str;
    private final int[] imgid;

    public BookCustomAdapter(Context c, String[] web, int[] Imageid) {
        acontext = c;
        this.imgid = Imageid;
        this.str = web;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return str.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View bookgrid;
        LayoutInflater inflater = (LayoutInflater) acontext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            bookgrid = inflater.inflate(R.layout.book_list, null);

            TextView textView = (TextView) bookgrid.findViewById(R.id.textView2);
            ImageView imageView = (ImageView) bookgrid.findViewById(R.id.imageView2);
            textView.setText(str[position]);
            imageView.setImageResource(imgid[position]);
            //  grid.setBackgroundResource(R.drawable.dashboard_color);
        } else {
            bookgrid = convertView;
        }
      /*  int color = 0x00FFFFFF; // Transparent
        if (position==0) {
            color = 0xFF0000FF; // Opaque Blue
        }

        grid.setBackgroundColor(color);*/

        return bookgrid;
    }
}