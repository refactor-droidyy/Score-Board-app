package com.example.rohit.scoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int i=0;
    int j=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(0);
    }

    public void incrementThree(View view)
    {
        i+=3;
        displayForTeamA(i);
    }

    public void incrementTwo(View view)
    {
        i+=2;
        displayForTeamA(i);
    }

    public void incrementOne(View view){
        i+=1;
        displayForTeamA(i);
    }
    public void setzero(View view){
        i = 0;
        j=0;
        displayForTeamA(i);
        displayForTeamB(j);
    }

    public void incrementThreeb(View view){
        j+=3;
        displayForTeamB(j);
    }

    public void incrementTwob(View view){
        j+=2;
        displayForTeamB(j);
    }
    public void incrementOneb(View view){
        j+=1;
        displayForTeamB(j);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
