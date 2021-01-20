package com.pru_mis_2020.electronicmenuorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    public Button welcome;
    public Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);

        welcome=findViewById(R.id.welcome);
        welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent welcome = new Intent(MainActivity5.this, com.pru_mis_2020.electronicmenuorder.MainActivity.class);
                startActivity(welcome);
            }
        });

        confirm=findViewById(R.id.confirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent welcome = new Intent(MainActivity5.this, com.pru_mis_2020.electronicmenuorder.MainActivity.class);
                startActivity(welcome);
            }
        });
    }
}

