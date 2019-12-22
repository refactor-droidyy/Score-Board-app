package com.example.rohit.scoreboard;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private Button three,two,one,three_b,two_b,one_c,reset,cricket;
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
        cricket = findViewById(R.id.cricket);


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
                reset();
            }
        });

        cricket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //
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
        displayForTeamB(j);
    }

    private void incrementTwob(){
        j+=2;
        displayForTeamB(j);
    }
    private void incrementOneb(){
        j+=1;
        displayForTeamB(j);
    }

    private void reset(){
        i=0;
        j=0;
        displayForTeamB(j);
        displayForTeamA(i);
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
