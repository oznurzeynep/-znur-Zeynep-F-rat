package com.pru_mis_2020.electronicmenuorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    public Button menu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite);

        menu2=findViewById(R.id.menu2);
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(MainActivity3.this, com.pru_mis_2020.electronicmenuorder.MainActivity4.class);
                startActivity(menu);
            }
        });
    }
}