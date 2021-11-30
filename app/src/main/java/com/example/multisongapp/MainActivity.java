package com.example.multisongapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
  ImageButton imageButton2,imageButton3,imageButton4,imageButton5,imageButton6,imageButton7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton2= findViewById(R.id.imageButton2);

        imageButton2= findViewById(R.id.imageButton2);
        imageButton3= findViewById(R.id.imageButton3);
        imageButton4= findViewById(R.id.imageButton4);
        imageButton5= findViewById(R.id.imageButton5);
        imageButton6= findViewById(R.id.imageButton6);
        imageButton7= findViewById(R.id.imageButton7);
    }
   public void PlayTheSong(View view){
        ImageButton imageButtonClicked =(ImageButton) view;

       MediaPlayer mediaPlayer = MediaPlayer.create(this,getResources().getIdentifier(imageButtonClicked.getTag().toString(),"raw",getPackageName()));
       mediaPlayer.start();

   }

}