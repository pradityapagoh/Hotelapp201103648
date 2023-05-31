package com.abrianus201103648.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.printservice.CustomPrinterIconCallback;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl ="https://asset.kompas.com/crops/3E57DYHDoTWVFxxpsBNSOlcMCkM=/0x0:1707x1138/750x500/data/photo/2022/09/13/63208b6bc7f9e.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}
