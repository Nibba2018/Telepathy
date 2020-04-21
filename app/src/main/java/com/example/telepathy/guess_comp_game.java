package com.example.telepathy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class guess_comp_game extends AppCompatActivity implements View.OnClickListener {

    private int val = (int)(Math.random()*(10000));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_comp_game);

        ImageButton submit = (ImageButton) findViewById(R.id.submit_button);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.getId() == R.id.submit_button){

            EditText guess_entry = (EditText) findViewById(R.id.user_entry);
            ImageView result_tile = (ImageView) findViewById(R.id.result_tile);
            int guess = Integer.parseInt(String.valueOf(guess_entry.getText()));
            result_tile.setVisibility(View.VISIBLE);

            if(guess>val)
                result_tile.setImageResource(R.drawable.go_lower_tile);
            else if(guess<val)
                result_tile.setImageResource(R.drawable.go_higher_tile);
            else{
                Intent goToEnd = new Intent();
                goToEnd.setClass(this, guess_comp_end.class);
                goToEnd.putExtra("Val", String.valueOf(val)+"!");
                startActivity(goToEnd);
            }
            Toast.makeText(getApplicationContext(), "Clicked...", Toast.LENGTH_SHORT).show();
        }
    }
}
