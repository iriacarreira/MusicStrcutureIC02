package com.example.android.musicstrcutureic02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.musicstrcutureic02.R.id.play_album;
import static com.example.android.musicstrcutureic02.R.id.play_song;
import static com.example.android.musicstrcutureic02.R.id.play_song2;
import static com.example.android.musicstrcutureic02.R.id.play_song3;
import static com.example.android.musicstrcutureic02.R.id.play_song4;
import static com.example.android.musicstrcutureic02.R.id.play_song5;

public class TopSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_songs);

        // Find the View that shows the top songs and takes you to the number 1 song
        TextView topSongs = (TextView) findViewById(play_song);

        // Set a click listener on that View
        topSongs.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the news one category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicPlayer/PlayingActivity}
                Intent numbersIntent = new Intent(TopSongsActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the top songs and takes you to the number 2 song
        TextView topSongs2 = (TextView) findViewById(play_song2);

        // Set a click listener on that View
        topSongs2.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the news one category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicPlayer/PlayingActivity}
                Intent numbersIntent = new Intent(TopSongsActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the top songs and takes you to the number 3 song
        TextView topSongs3 = (TextView) findViewById(play_song3);

        // Set a click listener on that View
        topSongs3.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the news one category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicPlayer/PlayingActivity}
                Intent numbersIntent = new Intent(TopSongsActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the top songs and takes you to the number 4 song
        TextView topSongs4 = (TextView) findViewById(play_song4);

        // Set a click listener on that View
        topSongs4.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the news one category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicPlayer/PlayingActivity}
                Intent numbersIntent = new Intent(TopSongsActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the top songs and takes you to the number 5 song
        TextView topSongs5 = (TextView) findViewById(play_song5);

        // Set a click listener on that View
        topSongs5.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the news one category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicPlayer/PlayingActivity}
                Intent numbersIntent = new Intent(TopSongsActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });
    }
}
