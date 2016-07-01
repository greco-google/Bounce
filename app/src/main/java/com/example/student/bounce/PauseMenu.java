package com.example.student.bounce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PauseMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pause_menu);
    }
    public void button26(View view){
        Intent intent = new Intent(this, GamePlay.class);
        startActivity(intent);

    }
    public void button25(View view){
        Intent intent = new Intent(this, Store.class);
        startActivity(intent);

    }
    public void button24(View view){
        Intent intent = new Intent(this, OpeningScreen.class);
        startActivity(intent);

    }
}
