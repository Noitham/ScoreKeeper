package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int yellowCardsTeamA = 0;
    int redCardsTeamA = 0;
    int scoreTeamB = 0;
    int yellowCardsTeamB = 0;
    int redCardsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayGoalsForTeamA(scoreTeamA);
        displayYellowCardsForTeamA(yellowCardsTeamA);
        displayRedCardsForTeamA(redCardsTeamA);
        displayGoalsForTeamB(scoreTeamB);
        displayYellowCardsForTeamB(yellowCardsTeamB);
        displayRedCardsForTeamB(redCardsTeamB);
    }

    /**
     * Increase the score for Team A.
     */
    public void addGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayGoalsForTeamA(scoreTeamA);
    }

    /**
     * Adds a yellow card for team A
     */
    public void addYellowCardForTeamA(View v) {
        yellowCardsTeamA = yellowCardsTeamA + 1;
        displayYellowCardsForTeamA(yellowCardsTeamA);
    }

    /**
     * Adds a red card for team A
     */
    public void addRedCardForTeamA(View v) {
        redCardsTeamA = redCardsTeamA + 1;
        displayRedCardsForTeamA(redCardsTeamA);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayGoalsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given yellow cards for Team A.
     */
    public void displayYellowCardsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellowcards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given red cards for Team A.
     */
    public void displayRedCardsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_redcards);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increases the score for Team B.
     */
    public void addGoalForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayGoalsForTeamB(scoreTeamB);
    }

    /**
     * Adds a yellow card for team B
     */
    public void addYellowCardForTeamB(View v) {
        yellowCardsTeamB = yellowCardsTeamB + 1;
        displayYellowCardsForTeamB(yellowCardsTeamB);
    }

    /**
     * Adds a red card for team B
     */
    public void addRedCardForTeamB(View v) {
        redCardsTeamB = redCardsTeamB + 1;
        displayRedCardsForTeamB(redCardsTeamB);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayGoalsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given yellow cards for Team B.
     */
    public void displayYellowCardsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellowcards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given red cards for Team B.
     */
    public void displayRedCardsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_redcards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset both teams data.
     */
    public void reset(View v) {
        scoreTeamA = 0;
        yellowCardsTeamA = 0;
        redCardsTeamA = 0;
        scoreTeamB = 0;
        yellowCardsTeamB = 0;
        redCardsTeamB = 0;
        displayGoalsForTeamA(scoreTeamA);
        displayYellowCardsForTeamA(yellowCardsTeamA);
        displayRedCardsForTeamA(redCardsTeamA);
        displayGoalsForTeamB(scoreTeamB);
        displayYellowCardsForTeamB(yellowCardsTeamB);
        displayRedCardsForTeamB(redCardsTeamB);
    }
}
