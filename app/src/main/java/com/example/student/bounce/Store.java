package com.example.student.bounce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Store extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
    }
    public void button3(View view) {
        Intent intent = new Intent(this, BallStore.class);
        startActivity(intent);
    }
    public void button4(View view) {
        Intent intent = new Intent(this, TrackStore.class);
        startActivity(intent);
    }
    public void button6(View view) {
        Intent intent = new Intent(this, CoinShop.class);
        startActivity(intent);
    }
}
