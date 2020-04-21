package com.example.telepathy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class comp_guess_end extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_guess_end);

        Intent guess = getIntent();

        TextView result = (TextView) findViewById(R.id.comp_guess_result);
        String query = String.valueOf(result.getText()) + guess.getStringExtra("Val");
        result.setText(query);

        ImageButton replayButton = (ImageButton) findViewById(R.id.replay);
        ImageButton quitButton = (ImageButton) findViewById(R.id.quitButton);
        ImageButton homeButton = (ImageButton) findViewById(R.id.home);

        replayButton.setOnClickListener(this);
        quitButton.setOnClickListener(this);
        homeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.quitButton:{
                Toast.makeText(getApplicationContext(), "Exiting Telepathy...", Toast.LENGTH_SHORT).show();
                finish();
                moveTaskToBack(true);
                break;
            }
            case R.id.home:{
                Intent goToHome = new Intent();
                goToHome.setClass(this, MainActivity.class);
                startActivity(goToHome);
                break;
            }
            case R.id.replay:{
                Intent goToGame = new Intent();
                goToGame.setClass(this, comp_guess_game.class);
                startActivity(goToGame);
                break;
            }
        }
    }
}
