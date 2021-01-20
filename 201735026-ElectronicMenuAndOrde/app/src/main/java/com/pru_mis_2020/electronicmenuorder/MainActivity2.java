package com.pru_mis_2020.electronicmenuorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    public Button welcome2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tracking);

        welcome2 = findViewById(R.id.welcome2);
        welcome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent welcome = new Intent(MainActivity2.this, com.pru_mis_2020.electronicmenuorder.MainActivity.class);
                startActivity(welcome);

            }
        });
    }
}