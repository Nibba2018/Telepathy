package com.example.telepathy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class guess_comp_rules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_comp_rules);

        ImageButton continueButton = (ImageButton) findViewById(R.id.continueButton);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToGame = new Intent();
                goToGame.setClass(getApplicationContext(), guess_comp_game.class);
                startActivity(goToGame);
            }
        });
    }
}
