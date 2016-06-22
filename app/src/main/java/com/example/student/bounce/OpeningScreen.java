package com.example.student.bounce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OpeningScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opening_screen);
    }

    public void buttonClicked(View view){
        Intent intent = new Intent(this, GamePlay.class);
        startActivity(intent);

    }
    public void imageButtonClicked(View view){
        Intent intent = new Intent(this, Store.class);
        startActivity(intent);

    }

}
