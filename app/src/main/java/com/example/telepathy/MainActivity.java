package com.example.telepathy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton comp_guess = (ImageButton) findViewById(R.id.comp_guess);
        ImageButton guess_comp = (ImageButton) findViewById(R.id.guess_comp);

        comp_guess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToRules = new Intent();
                goToRules.setClass(getApplicationContext(), comp_guess_rules.class);
                startActivity(goToRules);
            }
        });

        guess_comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
