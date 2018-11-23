package com.example.android.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA=0;
    int scoreB=0;

    public void incScoreABy2(View view)
    {
        scoreA+=2;
        dispAScore();
    }
    public void incScoreABy1(View view)
    {
        scoreA++;
        dispAScore();
    }

    public void incScoreBBy2(View view)
    {
        scoreB+=2;
        dispBScore();
    }
    public void incScoreBBy1(View view)
    {
        scoreB++;
        dispBScore();
    }

    public void dispAScore()
    {
        TextView tv=findViewById(R.id.scoreATextView);
        tv.setText(String.valueOf(scoreA));
    }

    public void dispBScore()
    {
        TextView tv=findViewById(R.id.scoreBTextView);
        tv.setText(String.valueOf(scoreB));
    }

    public void showResult(View view)
    {
        TextView tv=(TextView)findViewById(R.id.resultTextView);
        if(scoreA>scoreB)
        {
            tv.setText("A Wins!");
        }
        else if(scoreA<scoreB)
        {
            tv.setText("B Wins!");
        }
        else
        {
            tv.setText("Its a Draw!");
        }
        scoreA=0;
        scoreB=0;
        dispAScore();
        dispBScore();
    }

}
