package com.example.telepathy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class guess_comp_end extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_comp_end);

        Intent gameRes = getIntent();

        TextView result = (TextView) findViewById(R.id.guess_comp_result);
        String query = String.valueOf(result.getText()) + gameRes.getStringExtra("Val");
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
                goToGame.setClass(this, guess_comp_game.class);
                startActivity(goToGame);
                break;
            }
        }
    }
}
