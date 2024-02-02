package com.xlsoft.haregame2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import android.os.Bundle;

public class HowToPlay extends AppCompatActivity {
    static int[] slide = {
            R.drawable.slide1
            , R.drawable.slide2
            , R.drawable.slide3
            ,R.drawable.slide4
    };

    int count = 0;
    // 次へのボタン
    public void b0(View v) {

        if(count >= 3){
            finish();
        }else{
            // 画像の変更 （画像を設定）
            count += 1;
            ((ImageView) findViewById(R.id.back)).setImageResource(slide[count]);

        }
    }

    // 戻るのボタン
    public void b1(View v) {

        if(count <= 0){
            finish();
        }else{
            // 画像の変更 （画像を設定）
            count -= 1;
            ((ImageView) findViewById(R.id.back)).setImageResource(slide[count]);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_play);
    }
}