package com.example.hp.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementOne(View view){
        scoreA+=1;
        incrementTeamA(scoreA);
    }
    public void incrementTwo(View view){
        scoreA+=2;
        incrementTeamA(scoreA);
    }
    public void incrementThree(View view){
        scoreA+=3;
        incrementTeamA(scoreA);
    }

    public void incrementOneB(View view){
        scoreB+=1;
        incrementTeamB(scoreB);
    }
    public void incrementTwoB(View view){
        scoreB+=2;
        incrementTeamB(scoreB);
    }
    public void incrementThreeB(View view){
        scoreB+=3;
        incrementTeamB(scoreB);
    }


    private void incrementTeamA(int score){
        TextView scoreView=(TextView) findViewById(R.id.scorea_increment);
        scoreView.setText(String.valueOf(score));
    }
    private void incrementTeamB(int score){
        TextView scoreView=(TextView) findViewById(R.id.scoreb_increment);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view){
        resetScore(0);
    }
    private void resetScore(int score){
        scoreA=score;
        scoreB=score;
        incrementTeamA(scoreA);
        incrementTeamB(scoreB);
    }
}
