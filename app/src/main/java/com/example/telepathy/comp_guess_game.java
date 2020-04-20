package com.example.telepathy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class comp_guess_game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_guess_game);
    }

    public void playGame(View v){
        ImageButton goLowerButton = (ImageButton) findViewById(R.id.go_lower);
        ImageButton goHigherButton = (ImageButton) findViewById(R.id.go_higher);
        ImageButton correctButton = (ImageButton) findViewById(R.id.correctButton);
        if (v.equals(goLowerButton)){
            Toast.makeText(getApplicationContext(), "Go Lower!!", Toast.LENGTH_SHORT).show();
        }
        else if (v.equals(goHigherButton)){
            Toast.makeText(getApplicationContext(), "Go Higher!!", Toast.LENGTH_SHORT).show();
        }
        else if (v.equals(correctButton)){
            Intent goToEnd = new Intent();
            goToEnd.setClass(getApplicationContext(), comp_guess_end.class);
            startActivity(goToEnd);
        }
    }
}
