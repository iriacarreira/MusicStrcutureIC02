package com.example.android.musicstrcutureic02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.musicstrcutureic02.R.id.news1;
import static com.example.android.musicstrcutureic02.R.id.play_album;
import static com.example.android.musicstrcutureic02.R.id.play_album2;
import static com.example.android.musicstrcutureic02.R.id.play_album3;
import static com.example.android.musicstrcutureic02.R.id.play_album4;
import static com.example.android.musicstrcutureic02.R.id.play_album5;

public class TopAlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_albums);



        // Find the View that shows the top albums and takes you to the number 1 album
        TextView topAlbums = (TextView) findViewById(play_album);

        // Set a click listener on that View
        topAlbums.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the news one category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicPlayer/PlayingActivity}
                Intent numbersIntent = new Intent(TopAlbumsActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the top albums and takes you to the number 2 album
        TextView topAlbums2 = (TextView) findViewById(play_album2);

        // Set a click listener on that View
        topAlbums2.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the news one category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicPlayer/PlayingActivity}
                Intent numbersIntent = new Intent(TopAlbumsActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the top albums and takes you to the number 3 album
        TextView topAlbums3 = (TextView) findViewById(play_album3);

        // Set a click listener on that View
        topAlbums3.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the news one category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicPlayer/PlayingActivity}
                Intent numbersIntent = new Intent(TopAlbumsActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the top albums and takes you to the number 4 album
        TextView topAlbums4 = (TextView) findViewById(play_album4);

        // Set a click listener on that View
        topAlbums4.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the news one category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicPlayer/PlayingActivity}
                Intent numbersIntent = new Intent(TopAlbumsActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the top albums and takes you to the number 5 album
        TextView topAlbums5 = (TextView) findViewById(play_album5);

        // Set a click listener on that View
        topAlbums5.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the news one category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicPlayer/PlayingActivity}
                Intent numbersIntent = new Intent(TopAlbumsActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

    }
}
