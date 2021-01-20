package com.pru_mis_2020.electronicmenuorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button menu;
    public Button tracking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        menu=findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent menu = new Intent(MainActivity.this,MainActivity4.class);
                startActivity(menu);
            }
        });
        tracking=findViewById(R.id.tracking);
        tracking.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tracking = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(tracking);

            }
        });
    }
}