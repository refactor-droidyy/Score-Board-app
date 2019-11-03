package com.example.rohit.scoreboard;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button three,two,one,three_b,two_b,one_c,reset;
    int i=0;
    int j=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        three = findViewById(R.id.three);
        two = findViewById(R.id.two);
        one = findViewById(R.id.one);
        three_b = findViewById(R.id.threeb);
        two_b = findViewById(R.id.twob);
        one_c = findViewById(R.id.oneb);
        reset = findViewById(R.id.reset);


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementThree();
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementTwo();
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementOne();
            }
        });

        three_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementThreeb();
            }
        });

        two_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementTwob();
            }
        });

        one_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementOneb();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create methid for reset
            }
        });

    }

    private void incrementThree()
    {
        i+=3;
        displayForTeamA(i);
    }

    private void incrementTwo()
    {
        i+=2;
        displayForTeamA(i);
    }

    private void incrementOne(){
        i+=1;
        displayForTeamA(i);
    }


    private void incrementThreeb(){
        j+=3;
        displayForTeamA(j);
    }

    private void incrementTwob(){
        j+=2;
        displayForTeamB(j);
    }
    private void incrementOneb(){
        j+=1;
        displayForTeamB(j);
    }
    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    private void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
