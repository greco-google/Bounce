package com.example.student.bounce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Store2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pause_menu);
    }
    public void button6(View view) {
        Intent intent = new Intent(this, CoinShop.class);
        startActivity(intent);
    }
}
