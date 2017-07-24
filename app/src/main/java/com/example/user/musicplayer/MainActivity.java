package com.example.user.musicplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button one = (Button) this.findViewById(R.id.playbutton);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.david_guetta);
        one.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.pause();
                    one.setText("PLAY");
                } else {
                    mp.start();
                    one.setText("PAUSE");
                }
            }
        });

        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(MainActivity.this, "Hey i'm Done", Toast.LENGTH_SHORT).show();

            }

        });

        mp.start();
//        Button two = (Button) this.findViewById(R.id.pausebutton);
//        final MediaPlayer mayer = MediaPlayer.create(this, R.raw.david_guetta);
//        two.setOnClickListener(new OnClickListener() {
//
//            public void onClick(View view) {
//                mayer.stop();
//            }
//        });
    }
}
