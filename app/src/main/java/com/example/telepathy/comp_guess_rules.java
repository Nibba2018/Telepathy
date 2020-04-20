package com.example.telepathy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class comp_guess_rules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_guess_rules);

        ImageButton continueButton = (ImageButton) findViewById(R.id.continueButton);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToRules = new Intent();
                goToRules.setClass(getApplicationContext(), comp_guess_game.class);
                startActivity(goToRules);
            }
        });
    }
}
