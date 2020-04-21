package com.example.telepathy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class comp_guess_game extends AppCompatActivity implements View.OnClickListener{

    private int upper_bound = 10000;
    private int lower_bound = 0;
    private int mid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_guess_game);

        this.mid = (this.lower_bound + this.upper_bound)/2;
        Toast.makeText(getApplicationContext(), "Is your number:" + String.valueOf(this.mid) + "?", Toast.LENGTH_SHORT).show();

        ImageButton goLower = (ImageButton) findViewById(R.id.go_lower);
        ImageButton goHigher = (ImageButton) findViewById(R.id.go_higher);
        ImageButton correctButton = (ImageButton) findViewById(R.id.correctButton);

        goLower.setOnClickListener(this);
        goHigher.setOnClickListener(this);
        correctButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.go_lower: this.upper_bound = this.mid - 1; break;
            case R.id.go_higher: this.lower_bound = this.mid + 1; break;
            case R.id.correctButton:{
                Intent goToEnd = new Intent();
                goToEnd.setClass(this, comp_guess_end.class);
                startActivity(goToEnd);
            }
        }

        Toast.makeText(getApplicationContext(), "Is your number:" + String.valueOf(this.mid) + "?", Toast.LENGTH_SHORT).show();
        this.mid = (this.upper_bound + this.lower_bound)/2;
    }
}
