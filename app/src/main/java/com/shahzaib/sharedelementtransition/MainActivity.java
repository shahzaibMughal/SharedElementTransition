package com.shahzaib.sharedelementtransition;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView sharedAndroidImage, sharedAdbImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedAndroidImage = findViewById(R.id.androidImage);
        sharedAdbImage = findViewById(R.id.adbImage);


    }

    public void startActivityOne(View view) {
        ActivityOptions options =
                ActivityOptions.makeSceneTransitionAnimation(
                        this,
                        sharedAndroidImage,
                        getString(R.string.androidImage));
        startActivity(new Intent(this,ActivityOne.class),options.toBundle());
    }


    public void startActivityTwo(View view) {
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this,sharedAdbImage, getString(R.string.adbImage));
        startActivity(new Intent(this,ActivityTwo.class),options.toBundle());
    }
}
