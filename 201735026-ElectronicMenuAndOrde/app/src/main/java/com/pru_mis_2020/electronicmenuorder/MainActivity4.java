package com.pru_mis_2020.electronicmenuorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    public EditText total1;
    public Button favorites;
    public Button order;
    boolean check = false;
    public CheckBox spagettiBolonese;
    public CheckBox spagettiNapoliten;
    public CheckBox penneArabiatta;
    public CheckBox bavettePesto;
    public CheckBox fusulliMasala;
    public CheckBox fusulliMalanzane;
    private Object CheckBox;
    int total = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        favorites = findViewById(R.id.favorites);
        favorites.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent favorites = new Intent(MainActivity4.this, MainActivity3.class);
                startActivity(favorites);
            }
        });

        order = findViewById(R.id.order);
        order.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent order = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(order);
            }
        });

        spagettiBolonese = findViewById(R.id.spagettiBolonese);
        spagettiBolonese.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean check = true;
                Intent order = new Intent(MainActivity4.this, MainActivity5.class);
                order.putExtra("Spagetti Bolonese", 50);
                startActivity(order);
            }
        });

        spagettiNapoliten = findViewById(R.id.spagettiNapoliten);
        spagettiNapoliten.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean check = true;
                Intent order = new Intent(MainActivity4.this, MainActivity5.class);
                order.putExtra("Spagetti Napoliten", 40);
                startActivity(order);
            }
        });

        penneArabiatta = findViewById(R.id.penneArabiatta);
        penneArabiatta.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean check = true;
                Intent order = new Intent(MainActivity4.this, MainActivity5.class);
                order.putExtra("Penne Arabiatta", 45);
                startActivity(order);
            }
        });

        bavettePesto = findViewById(R.id.bavettePesto);
        bavettePesto.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean check = true;
                Intent order = new Intent(MainActivity4.this, MainActivity5.class);
                order.putExtra("Bavette Pesto", 38);
                startActivity(order);
            }
        });

        fusulliMasala = findViewById(R.id.fusulliMasala);
        fusulliMasala.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean check = true;
                Intent order = new Intent(MainActivity4.this, MainActivity5.class);
                order.putExtra("Fusulli Masala", 40);
                startActivity(order);
            }
        });

        fusulliMalanzane = findViewById(R.id.fusulliMalanzane);
        fusulliMalanzane.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean check = true;
                Intent order = new Intent(MainActivity4.this, MainActivity5.class);
                order.putExtra("Fusulli Malanzane", 35);

                startActivity(order);
            }
        });

        spagettiBolonese = findViewById(R.id.spagettiBolonese);
        spagettiBolonese.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                if (CheckBox == true) {
                    total = total + 50;
                } else {
                    if (total != 0) {
                        total = total - 50;
                    }
                }
            }
        });

        spagettiNapoliten = findViewById(R.id.spagettiNapoliten);
        spagettiNapoliten.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                if (CheckBox == true) {
                    total = total + 40;
                } else {
                    if (total != 0) {
                        total = total - 40;
                    }
                }
            }
        });

        penneArabiatta = findViewById(R.id.penneArabiatta);
        penneArabiatta.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                if (CheckBox == true) {
                    total = total + 45;
                } else {
                    if (total != 0) {
                        total = total - 45;
                    }
                }
            }
        });

        bavettePesto = findViewById(R.id.bavettePesto);
        bavettePesto.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                if (CheckBox == true) {
                    total = total + 38;
                } else {
                    if (total != 0) {
                        total = total - 38;
                    }
                }
            }
        });

        fusulliMasala = findViewById(R.id.fusulliMasala);
        fusulliMasala.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                if (CheckBox == true) {
                    total = total + 40;
                } else {
                    if (total != 0) {
                        total = total - 40;
                    }
                }
            }
        });

        fusulliMalanzane = findViewById(R.id.fusulliMalanzane);
        fusulliMalanzane.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                if (CheckBox == true) {
                    total = total + 35;
                } else {
                    if (total != 0) {
                        total = total - 35;
                    }
                }
            }
        });

        final EditText total1;
        TextView total;
        CheckBox spagettiBolonese;
        CheckBox spagettiNapoliten;
        CheckBox penneArabiatta;
        CheckBox bavettePesto;
        CheckBox fusulliMasala;
        CheckBox fusulliMalanzane;


        setContentView(R.layout.menu);

        total1 = (EditText) findViewById(R.id.total1);
        total = (TextView) findViewById(R.id.total);
        spagettiBolonese = (CheckBox) findViewById(R.id.spagettiBolonese);
        spagettiNapoliten = (CheckBox) findViewById(R.id.spagettiNapoliten);
        penneArabiatta = (CheckBox) findViewById(R.id.penneArabiatta);
        bavettePesto = (CheckBox) findViewById(R.id.bavettePesto);
        fusulliMasala = (CheckBox) findViewById(R.id.fusulliMasala);
        fusulliMalanzane = (CheckBox) findViewById(R.id.fusulliMalanzane);

        spagettiBolonese.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String total = total1.getText().toString();

            }
        });


    }
}