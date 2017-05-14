package com.example.android.musicstrcutureic02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.example.android.musicstrcutureic02.R.drawable.news;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


    // Find the View that shows the news category
    TextView news1 = (TextView) findViewById(R.id.news1);

    // Set a click listener on that View
        news1.setOnClickListener(new View.OnClickListener() {

        // The code in this method will be executed when the news one category is clicked on.

        @Override
        public void onClick(View view) {
            // Create a new intent to open the {@link NewsOneActivity}
            Intent numbersIntent = new Intent(MainActivity.this, NewsOneActivity.class);

            // Start the new activity
            startActivity(numbersIntent);
        }
    });
        // Find the View that shows the topArtist category
        ImageButton topArtist = (ImageButton) findViewById(R.id.button3);

        // Set a click listener on that View
        topArtist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the topArtist category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link topArtist}
                Intent numbersIntent = new Intent(MainActivity.this, TopArtistActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });
        // Find the View that shows the topAlbums category
        ImageButton topAlbums = (ImageButton) findViewById(R.id.button2);

        // Set a click listener on that View
        topAlbums.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the topAlbums category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link topAlbums}
                Intent numbersIntent = new Intent(MainActivity.this, TopAlbumsActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the topSongs category
        ImageButton topSongs = (ImageButton) findViewById(R.id.button);

        // Set a click listener on that View
        topSongs.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the topSongs category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link topAlbums}
                Intent numbersIntent = new Intent(MainActivity.this, TopSongsActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });
}}
