package com.example.preimas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton favorit1 = findViewById(R.id.favtw);
        ImageButton favorit2 = findViewById(R.id.favnataru);

        setToggleButton(favorit1);
        setToggleButton(favorit2);
    }
    private void setToggleButton(final ImageButton favorit) {
        favorit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleFavorite(favorit);
            }
        });
    }
    private void toggleFavorite(ImageButton favorit) {
        if ("putih".equals(favorit.getTag())) {
            favorit.setColorFilter(Color.RED);
            favorit.setTag("merah");
        } else if ("merah".equals(favorit.getTag())) {
            favorit.setColorFilter(Color.WHITE);
            favorit.setTag("putih");
        }
    }


    public void loktw(View view) {
        String url = "https://maps.app.goo.gl/Zertn7bzJ2Nz8Xcg9";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    public void loknataru(View view) {
        String url = "https://maps.app.goo.gl/oc2iAaB2acaTDMBh8";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    public void view_tw(View view) {
        String url = "https://www.instagram.com/s/aGlnaGxpZ2h0OjE4MzI1ODI3NzEyMTA4NjM3?story_media_id=3271773366390425333_51531905302&igsh=a3dkdG9vODdycGtr";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    public void view_nataru(View view) {
        String url = "https://www.instagram.com/s/aGlnaGxpZ2h0OjE4MDE0NDMyMzcyMTAyNDUy?story_media_id=3270384691635063213_51531905302&igsh=cW01MjF0bHJ5OWFn";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }


}