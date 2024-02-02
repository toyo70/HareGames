package com.xlsoft.haregame2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView ivhounds1;
    ImageView ivhounds2;
    ImageView ivhounds3;
    ImageView ivhounds4;
    ImageView ivhounds5;
    ImageView ivhounds6;
    ImageView ivhounds7;
    ImageView ivhounds8;
    ImageView ivhounds9;
    ImageView ivhounds10;
    ImageView ivhounds11;

    ImageView ivrabbit1;
    ImageView ivrabbit2;
    ImageView ivrabbit3;
    ImageView ivrabbit4;
    ImageView ivrabbit5;
    ImageView ivrabbit6;
    ImageView ivrabbit7;
    ImageView ivrabbit8;
    ImageView ivrabbit9;
    ImageView ivrabbit10;
    ImageView ivrabbit11;

    ImageView ivBoard;
    ImageView iv1;
    ImageView iv2;
    ImageView iv3;
    ImageView iv4;
    ImageView iv5;
    ImageView iv6;
    ImageView iv7;
    ImageView iv8;
    ImageView iv9;
    ImageView iv10;
    ImageView iv11;

    TextView tvStart;
    TextView tvMessage;
    TextView tvMessage2;
    Button button;

    //先行おおかみ
    static boolean houndTurn = true;

    //初回限定フラグ
    static boolean touchEve = true;



    /*
    static int h1point = 2;     //表示上の駒がどこにあるか
    static int h2point = 1;
    static int h3point = 4;

     */
    static int r1point = 11;    //rabbit はおそらく使う

    static int turnCount = 0;   //30ターン目で終了

    static int selectHound = 0;
    static int selectRabbit = 0;    //誤操作防止のため Rabbitのターンでも毎回Rabbitを選択させる(選択=1,非選択=0)


    static int[] selectH1 = {1,2,4}; //houndsの配置をいれる


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivhounds1 = findViewById(R.id.ivhounds1);
        ivhounds2 = findViewById(R.id.ivhounds2);
        ivhounds3 = findViewById(R.id.ivhounds3);
        ivhounds4 = findViewById(R.id.ivhounds4);
        ivhounds5 = findViewById(R.id.ivhounds5);
        ivhounds6 = findViewById(R.id.ivhounds6);
        ivhounds7 = findViewById(R.id.ivhounds7);
        ivhounds8 = findViewById(R.id.ivhounds8);
        ivhounds9 = findViewById(R.id.ivhounds9);
        ivhounds10 = findViewById(R.id.ivhounds10);
        ivhounds11 = findViewById(R.id.ivhounds11);

        ivrabbit1 = findViewById(R.id.ivrabbit1);
        ivrabbit2 = findViewById(R.id.ivrabbit2);
        ivrabbit3 = findViewById(R.id.ivrabbit3);
        ivrabbit4 = findViewById(R.id.ivrabbit4);
        ivrabbit5 = findViewById(R.id.ivrabbit5);
        ivrabbit6 = findViewById(R.id.ivrabbit6);
        ivrabbit7 = findViewById(R.id.ivrabbit7);
        ivrabbit8 = findViewById(R.id.ivrabbit8);
        ivrabbit9 = findViewById(R.id.ivrabbit9);
        ivrabbit10 = findViewById(R.id.ivrabbit10);
        ivrabbit11 = findViewById(R.id.ivrabbit11);


        ivBoard = findViewById(R.id.ivBoard);
        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
        iv4 = findViewById(R.id.iv4);
        iv5 = findViewById(R.id.iv5);
        iv6 = findViewById(R.id.iv6);
        iv7 = findViewById(R.id.iv7);
        iv8 = findViewById(R.id.iv8);
        iv9 = findViewById(R.id.iv9);
        iv10 = findViewById(R.id.iv10);
        iv11 = findViewById(R.id.iv11);

        tvStart = findViewById(R.id.tvStart);
        tvMessage = findViewById(R.id.tvMessage);
        tvMessage2 = findViewById(R.id.tvMessage2);

        button = findViewById(R.id.button);

        printTurn();
        Context context = getApplicationContext();


        //ターンチェンジ デバッグ用
        /*
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(houndTurn){
                    houndTurn = false;
                    selectHound = 0;
                }else{
                    houndTurn = true;
                    selectRabbit = 0;
                }
            }
        });

         */

        //usagi判定
        ivrabbit1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(!houndTurn) {
                    selectRabbit = 1;
                    tvMessage2.setText("rabbit1");
                }
            }
        });
        ivrabbit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!houndTurn) {
                    selectRabbit = 2;
                    //tvMessage2.setText("rabbit2");
                }
            }
        });
        ivrabbit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!houndTurn) {
                    selectRabbit = 3;
                    //tvMessage2.setText("rabbit3");
                }
            }
        });
        ivrabbit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!houndTurn) {
                    selectRabbit = 4;
                    //tvMessage2.setText("rabbit4");
                }
            }
        });
        ivrabbit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!houndTurn) {
                    selectRabbit = 5;
                    //tvMessage2.setText("rabbit5");
                }
            }
        });
        ivrabbit6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!houndTurn) {
                    selectRabbit = 6;
                    //tvMessage2.setText("rabbit6");
                }
            }
        });
        ivrabbit7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!houndTurn) {
                    selectRabbit = 7;
                    //tvMessage2.setText("rabbit7");
                }
            }
        });
        ivrabbit8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!houndTurn) {
                    selectRabbit = 8;
                    //tvMessage2.setText("rabbit8");
                }
            }
        });
        ivrabbit9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!houndTurn) {
                    selectRabbit = 9;
                    //tvMessage2.setText("rabbit9");
                }
            }
        });
        ivrabbit10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!houndTurn) {
                    selectRabbit = 10;
                    //tvMessage2.setText("rabbit10");
                }
            }
        });
        ivrabbit11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!houndTurn) {
                    selectRabbit = 11;
                    //tvMessage2.setText("rabbit11");
                }
            }
        });




        //コマの判定
        ivhounds1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(houndTurn) {
                    selectHound = 1;
                    //tvMessage2.setText("hounds1");
                }

            }
        });
        ivhounds2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(houndTurn) {
                    selectHound = 2;
                    //tvMessage2.setText("hounds2");
                }
            }
        });
        ivhounds3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(houndTurn) {
                    selectHound = 3;
                    //tvMessage2.setText("hounds3");
                }
            }
        });
        ivhounds4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(houndTurn) {
                    selectHound = 4;
                    //tvMessage2.setText("hounds4");
                }
            }
        });
        ivhounds5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(houndTurn) {
                    selectHound = 5;
                    //tvMessage2.setText("hounds5");
                }
            }
        });
        ivhounds6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(houndTurn) {
                    selectHound = 6;
                    //tvMessage2.setText("hounds6");
                }
            }
        });
        ivhounds7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(houndTurn) {
                    selectHound = 7;
                    //tvMessage2.setText("hounds7");
                }
            }
        });
        ivhounds8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(houndTurn) {
                    selectHound = 8;
                    //tvMessage2.setText("hounds8");
                }
            }
        });
        ivhounds9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(houndTurn) {
                    selectHound = 9;
                    //tvMessage2.setText("hounds9");
                }
            }
        });
        ivhounds10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(houndTurn) {
                    selectHound = 10;
                    //tvMessage2.setText("hounds10");
                }
            }
        });
        ivhounds11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(houndTurn) {
                    selectHound = 11;
                    //tvMessage2.setText("hounds11");
                }
            }
        });



        //turn制限30
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //マスの座標
                int ivIdx = 1;
                if(houndTurn) {
                    if (selectHound == 0) {
                        tvMessage2.setText("Houndを選択してください");
                    } else {
                        if(Judge.JudgeH(selectHound,ivIdx)) {
                            changeIDXh(selectHound, ivIdx);
                            changeVISIh(selectHound, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }else{
                    if(selectRabbit == 0){
                        tvMessage2.setText("Rabbitを選択してください");
                    }else{
                        if(Judge.JudgeR(selectRabbit,ivIdx)) {
                            changeIDXr(selectRabbit, ivIdx);
                            changeVISIr(selectRabbit, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }
            }
        });

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //マスの座標
                int ivIdx = 2;
                if(houndTurn) {
                    if (selectHound == 0) {
                        tvMessage2.setText("Houndを選択してください");
                    } else {
                        if(Judge.JudgeH(selectHound,ivIdx)) {
                            changeIDXh(selectHound, ivIdx);
                            changeVISIh(selectHound, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }else{
                    if(selectRabbit == 0){
                        tvMessage2.setText("Rabbitを選択してください");
                    }else{
                        if(Judge.JudgeR(selectRabbit,ivIdx)) {
                            changeIDXr(selectRabbit, ivIdx);
                            changeVISIr(selectRabbit, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }
            }
        });

        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //マスの座標
                int ivIdx = 3;
                if(houndTurn) {
                    if (selectHound == 0) {
                        tvMessage2.setText("Houndを選択してください");
                    } else {
                        if(Judge.JudgeH(selectHound,ivIdx)) {
                            changeIDXh(selectHound, ivIdx);
                            changeVISIh(selectHound, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }else{
                    if(selectRabbit == 0){
                        tvMessage2.setText("Rabbitを選択してください");
                    }else{
                        if(Judge.JudgeR(selectRabbit,ivIdx)) {
                            changeIDXr(selectRabbit, ivIdx);
                            changeVISIr(selectRabbit, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }
            }
        });

        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //マスの座標
                int ivIdx = 4;
                if(houndTurn) {
                    if (selectHound == 0) {
                        tvMessage2.setText("Houndを選択してください");
                    } else {
                        if(Judge.JudgeH(selectHound,ivIdx)) {
                            changeIDXh(selectHound, ivIdx);
                            changeVISIh(selectHound, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }else{
                    if(selectRabbit == 0){
                        tvMessage2.setText("Rabbitを選択してください");
                    }else{
                        if(Judge.JudgeR(selectRabbit,ivIdx)) {
                            changeIDXr(selectRabbit, ivIdx);
                            changeVISIr(selectRabbit, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }
            }
        });

        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //マスの座標
                int ivIdx = 5;
                if(houndTurn) {
                    if (selectHound == 0) {
                        tvMessage2.setText("Houndを選択してください");
                    } else {
                        if(Judge.JudgeH(selectHound,ivIdx)) {
                            changeIDXh(selectHound, ivIdx);
                            changeVISIh(selectHound, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }else{
                    if(selectRabbit == 0){
                        tvMessage2.setText("Rabbitを選択してください");
                    }else{
                        if(Judge.JudgeR(selectRabbit,ivIdx)) {
                            changeIDXr(selectRabbit, ivIdx);
                            changeVISIr(selectRabbit, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }
            }
        });

        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //マスの座標
                int ivIdx = 6;
                if(houndTurn) {
                    if (selectHound == 0) {
                        tvMessage2.setText("Houndを選択してください");
                    } else {
                        if(Judge.JudgeH(selectHound,ivIdx)) {
                            changeIDXh(selectHound, ivIdx);
                            changeVISIh(selectHound, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }else{
                    if(selectRabbit == 0){
                        tvMessage2.setText("Rabbitを選択してください");
                    }else{
                        if(Judge.JudgeR(selectRabbit,ivIdx)) {
                            changeIDXr(selectRabbit, ivIdx);
                            changeVISIr(selectRabbit, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }
            }
        });

        iv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //マスの座標
                int ivIdx = 7;
                if(houndTurn) {
                    if (selectHound == 0) {
                        tvMessage2.setText("Houndを選択してください");
                    } else {
                        if(Judge.JudgeH(selectHound,ivIdx)) {
                            changeIDXh(selectHound, ivIdx);
                            changeVISIh(selectHound, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }else{
                    if(selectRabbit == 0){
                        tvMessage2.setText("Rabbitを選択してください");
                    }else{
                        if(Judge.JudgeR(selectRabbit,ivIdx)) {
                            changeIDXr(selectRabbit, ivIdx);
                            changeVISIr(selectRabbit, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }
            }
        });

        iv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //マスの座標
                int ivIdx = 8;
                if(houndTurn) {
                    if (selectHound == 0) {
                        tvMessage2.setText("Houndを選択してください");
                    } else {
                        if(Judge.JudgeH(selectHound,ivIdx)) {
                            changeIDXh(selectHound, ivIdx);
                            changeVISIh(selectHound, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }else{
                    if(selectRabbit == 0){
                        tvMessage2.setText("Rabbitを選択してください");
                    }else{
                        if(Judge.JudgeR(selectRabbit,ivIdx)) {
                            changeIDXr(selectRabbit, ivIdx);
                            changeVISIr(selectRabbit, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }
            }
        });

        iv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //マスの座標
                int ivIdx = 9;
                if(houndTurn) {
                    if (selectHound == 0) {
                        tvMessage2.setText("Houndを選択してください");
                    } else {
                        if(Judge.JudgeH(selectHound,ivIdx)) {
                            changeIDXh(selectHound, ivIdx);
                            changeVISIh(selectHound, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }else{
                    if(selectRabbit == 0){
                        tvMessage2.setText("Rabbitを選択してください");
                    }else{
                        if(Judge.JudgeR(selectRabbit,ivIdx)) {
                            changeIDXr(selectRabbit, ivIdx);
                            changeVISIr(selectRabbit, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }
            }
        });

        iv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //マスの座標
                int ivIdx = 10;
                if(houndTurn) {
                    if (selectHound == 0) {
                        tvMessage2.setText("Houndを選択してください");
                    } else {
                        if(Judge.JudgeH(selectHound,ivIdx)) {
                            changeIDXh(selectHound, ivIdx);
                            changeVISIh(selectHound, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }else{
                    if(selectRabbit == 0){
                        tvMessage2.setText("Rabbitを選択してください");
                    }else{
                        if(Judge.JudgeR(selectRabbit,ivIdx)) {
                            changeIDXr(selectRabbit, ivIdx);
                            changeVISIr(selectRabbit, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }
            }
        });

        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //マスの座標
                int ivIdx = 11;
                if(houndTurn) {
                    if (selectHound == 0) {
                        tvMessage2.setText("Houndを選択してください");
                    } else {
                        if(Judge.JudgeH(selectHound,ivIdx)) {
                            changeIDXh(selectHound, ivIdx);
                            changeVISIh(selectHound, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }else{
                    if(selectRabbit == 0){
                        tvMessage2.setText("Rabbitを選択してください");
                    }else{
                        if(Judge.JudgeR(selectRabbit,ivIdx)) {
                            changeIDXr(selectRabbit, ivIdx);
                            changeVISIr(selectRabbit, ivIdx);
                        }else{
                            tvMessage.setText("その場所には行けません");
                        }
                    }
                }
            }
        });





    }

    public void printTurn(){
        if(houndTurn){
            tvMessage.setText("猟犬のターン");
            winR();
            winH();
        }else{
            tvMessage.setText("うさぎのターン");
            winH();
            winR();
        }
    }
    //hound側の駒を移動
    public void changeVISIh(int oldIdx, int newIdx){
        switch (oldIdx){
            case 1:
                ivhounds1.setVisibility(View.GONE);
                break;
            case 2:
                ivhounds2.setVisibility(View.GONE);
                break;
            case 3:
                ivhounds3.setVisibility(View.GONE);
                break;
            case 4:
                ivhounds4.setVisibility(View.GONE);
                break;
            case 5:
                ivhounds5.setVisibility(View.GONE);
                break;
            case 6:
                ivhounds6.setVisibility(View.GONE);
                break;
            case 7:
                ivhounds7.setVisibility(View.GONE);
                break;
            case 8:
                ivhounds8.setVisibility(View.GONE);
                break;
            case 9:
                ivhounds9.setVisibility(View.GONE);
                break;
            case 10:
                ivhounds10.setVisibility(View.GONE);
                break;
            case 11:
                ivhounds11.setVisibility(View.GONE);
                break;
        }
        switch (newIdx){
            case 1:
                ivhounds1.setVisibility(View.VISIBLE);
                break;
            case 2:
                ivhounds2.setVisibility(View.VISIBLE);
                break;
            case 3:
                ivhounds3.setVisibility(View.VISIBLE);
                break;
            case 4:
                ivhounds4.setVisibility(View.VISIBLE);
                break;
            case 5:
                ivhounds5.setVisibility(View.VISIBLE);
                break;
            case 6:
                ivhounds6.setVisibility(View.VISIBLE);
                break;
            case 7:
                ivhounds7.setVisibility(View.VISIBLE);
                break;
            case 8:
                ivhounds8.setVisibility(View.VISIBLE);
                break;
            case 9:
                ivhounds9.setVisibility(View.VISIBLE);
                break;
            case 10:
                ivhounds10.setVisibility(View.VISIBLE);
                break;
            case 11:
                ivhounds11.setVisibility(View.VISIBLE);
                break;

        }
        houndTurn =false;
        selectHound=0;
        printTurn();
    }
    public int changeIDXh(int oldIdx, int newIdx){
        if(selectH1[0] == oldIdx) {
            selectH1[0] = newIdx;
            return 0;   //この数字を使うなら+1必須
        }else if(selectH1[1] == oldIdx){
            selectH1[1] = newIdx;
            return 1;
        }else if(selectH1[2] == oldIdx){
            selectH1[2] = newIdx;
            return 2;
        }else {
            return 99;
        }
    }
    //rabbitの駒を移動
    public void changeVISIr(int oldIdx,int newIdx){
        switch (oldIdx){
            case 1:
                ivrabbit1.setVisibility(View.GONE);
                break;
            case 2:
                ivrabbit2.setVisibility(View.GONE);
                break;
            case 3:
                ivrabbit3.setVisibility(View.GONE);
                break;
            case 4:
                ivrabbit4.setVisibility(View.GONE);
                break;
            case 5:
                ivrabbit5.setVisibility(View.GONE);
                break;
            case 6:
                ivrabbit6.setVisibility(View.GONE);
                break;
            case 7:
                ivrabbit7.setVisibility(View.GONE);
                break;
            case 8:
                ivrabbit8.setVisibility(View.GONE);
                break;
            case 9:
                ivrabbit9.setVisibility(View.GONE);
                break;
            case 10:
                ivrabbit10.setVisibility(View.GONE);
                break;
            case 11:
                ivrabbit11.setVisibility(View.GONE);
                break;
        }
        switch (newIdx){
            case 1:
                ivrabbit1.setVisibility(View.VISIBLE);
                break;
            case 2:
                ivrabbit2.setVisibility(View.VISIBLE);
                break;
            case 3:
                ivrabbit3.setVisibility(View.VISIBLE);
                break;
            case 4:
                ivrabbit4.setVisibility(View.VISIBLE);
                break;
            case 5:
                ivrabbit5.setVisibility(View.VISIBLE);
                break;
            case 6:
                ivrabbit6.setVisibility(View.VISIBLE);
                break;
            case 7:
                ivrabbit7.setVisibility(View.VISIBLE);
                break;
            case 8:
                ivrabbit8.setVisibility(View.VISIBLE);
                break;
            case 9:
                ivrabbit9.setVisibility(View.VISIBLE);
                break;
            case 10:
                ivrabbit10.setVisibility(View.VISIBLE);
                break;
            case 11:
                ivrabbit11.setVisibility(View.VISIBLE);
                break;
        }
        houndTurn=true;
        selectRabbit=0;
        printTurn();
    }
    public void changeIDXr(int oldIdx, int newIdx){
        if(r1point == oldIdx) {
            r1point = newIdx;
            return;
        }
    }


    //勝敗判定
    public void winR(){
        int h1 = Judge.colCheck(selectH1[0]);
        int h2 = Judge.colCheck(selectH1[1]);
        int h3 = Judge.colCheck(selectH1[2]);
        int r1 = Judge.colCheck(r1point);

        if(h1>=r1 && h2>=r1 && h3>=r1){
            Intent intent = new Intent(getApplication(), ResultActivity.class);
            startActivity(intent);
            finish();
            tvMessage2.setText("うさぎの勝ち");
            Judge.winner=2;
        }else if(turnCount >= 30){
            Intent intent = new Intent(getApplication(), ResultActivity.class);
            startActivity(intent);
            finish();
            tvMessage2.setText("うさぎの勝ち");
            Judge.winner=2;
        }
        turnCount++;
        tvMessage2.setText("ターン:"+turnCount+"/30");
    }
    public void winH(){
        //tvMessage2.setText(selectH1[0]+":"+selectH1[1]+":"+selectH1[2]);
        //tvMessage.setText(r1point+":"+Judge.JudgeR(r1point,selectH1[0]) +":"+ Judge.JudgeR(r1point,selectH1[1]) +""+ Judge.JudgeR(r1point,selectH1[2]));
        if(Judge.JudgeR(r1point,selectH1[0]) && Judge.JudgeR(r1point,selectH1[1]) && Judge.JudgeR(r1point,selectH1[2])){
            if(Judge.effort == 3) {
                Intent intent = new Intent(getApplication(), ResultActivity.class);
                startActivity(intent);
                finish();
                tvMessage2.setText("猟犬の勝ち");
                Judge.winner=1;
            }
        }
    }
}

