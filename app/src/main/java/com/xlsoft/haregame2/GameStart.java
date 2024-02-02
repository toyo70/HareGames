package com.xlsoft.haregame2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GameStart extends AppCompatActivity {

    Button bthare;
    Button bthow;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start);

        bthare = findViewById(R.id.haregame);
        bthow = findViewById(R.id.howto);
        title = findViewById(R.id.title);

        /* ボタンサイズの設定 */
        bthare.setWidth(400);
        bthow.setWidth(400);

        /* GAME STARTが押されたら */
        bthare.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), MainActivity.class);
            startActivity(intent);
        });

        /* ルール説明が押されたら */
        bthow.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), HowToPlay.class);
            startActivity(intent);
        });

    }
}