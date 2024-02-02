package com.xlsoft.haregame2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView tvResult;
    Button btRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvResult=findViewById(R.id.tvResult);
        btRestart=findViewById(R.id.btRestart);



        if(Judge.winner == 1){
            tvResult.setText("猟犬の勝ち");
        }else if(Judge.winner == 2){
            tvResult.setText("うさぎの勝ち");
        }

        btRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Judge
                Judge.Remake();
                finish();

            }
        });

    }
}