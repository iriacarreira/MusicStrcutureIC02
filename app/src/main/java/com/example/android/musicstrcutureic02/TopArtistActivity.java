package com.example.android.musicstrcutureic02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.musicstrcutureic02.R.id.play_album;
import static com.example.android.musicstrcutureic02.R.id.play_artist;
import static com.example.android.musicstrcutureic02.R.id.play_artist2;
import static com.example.android.musicstrcutureic02.R.id.play_artist3;
import static com.example.android.musicstrcutureic02.R.id.play_artist4;
import static com.example.android.musicstrcutureic02.R.id.play_artist5;

public class TopArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_artist);

        // Find the View that shows the top artist and takes you to the number 1 artist
        TextView topArtist = (TextView) findViewById(play_artist);

        // Set a click listener on that View
        topArtist.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the news one category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicPlayer/PlayingActivity}
                Intent numbersIntent = new Intent(TopArtistActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the top artist and takes you to the number 2 artist
        TextView topArtist2 = (TextView) findViewById(play_artist2);

        // Set a click listener on that View
        topArtist2.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the news one category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicPlayer/PlayingActivity}
                Intent numbersIntent = new Intent(TopArtistActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the top artist and takes you to the number 3 artist
        TextView topArtist3 = (TextView) findViewById(play_artist3);

        // Set a click listener on that View
        topArtist3.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the news one category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicPlayer/PlayingActivity}
                Intent numbersIntent = new Intent(TopArtistActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the top artist and takes you to the number 4 artist
        TextView topArtist4 = (TextView) findViewById(play_artist4);

        // Set a click listener on that View
        topArtist4.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the news one category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicPlayer/PlayingActivity}
                Intent numbersIntent = new Intent(TopArtistActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the top artist and takes you to the number 5 artist
        TextView topArtist5 = (TextView) findViewById(play_artist5);

        // Set a click listener on that View
        topArtist5.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the news one category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicPlayer/PlayingActivity}
                Intent numbersIntent = new Intent(TopArtistActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });


    }
}
