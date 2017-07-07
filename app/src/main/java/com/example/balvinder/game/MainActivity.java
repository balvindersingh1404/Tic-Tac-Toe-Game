package com.example.balvinder.game;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int count = 0;
    View v = null;
    String p1 = "PLAYER1", p2 = "PLAYER2", p3 = "DRAW";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        b1.setBackgroundColor(Color.WHITE);
        b2.setBackgroundColor(Color.WHITE);
        b3.setBackgroundColor(Color.WHITE);
        b4.setBackgroundColor(Color.WHITE);
        b5.setBackgroundColor(Color.WHITE);
        b6.setBackgroundColor(Color.WHITE);
        b7.setBackgroundColor(Color.WHITE);
        b8.setBackgroundColor(Color.WHITE);
        b9.setBackgroundColor(Color.WHITE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {v = b1;play();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {v = b2;play();
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {v = b3;play();
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {v = b4;play();
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v = b5;play();
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v = b6;play();
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v = b7;play();
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v = b8;play();
            }
        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v = b9;play();
            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public void play() {
        ColorDrawable drawable = (ColorDrawable) v.getBackground();
        int colorId = drawable.getColor();

        if (colorId == Color.WHITE && count != 9) {
            if (count % 2 == 0) {
                v.setBackgroundColor(Color.GREEN);
            } else {
                v.setBackgroundColor(Color.RED);
            }
            count++;
        }
        calculateScore();
    }


    public void calculateScore() {

        ColorDrawable drawable1 = (ColorDrawable) b1.getBackground();
        ColorDrawable drawable2 = (ColorDrawable) b2.getBackground();
        ColorDrawable drawable3 = (ColorDrawable) b3.getBackground();
        ColorDrawable drawable4 = (ColorDrawable) b4.getBackground();
        ColorDrawable drawable5 = (ColorDrawable) b5.getBackground();
        ColorDrawable drawable6 = (ColorDrawable) b6.getBackground();
        ColorDrawable drawable7 = (ColorDrawable) b7.getBackground();
        ColorDrawable drawable8 = (ColorDrawable) b8.getBackground();
        ColorDrawable drawable9 = (ColorDrawable) b9.getBackground();

        int colorId1 = drawable1.getColor();
        int colorId2 = drawable2.getColor();
        int colorId3 = drawable3.getColor();
        int colorId4 = drawable4.getColor();
        int colorId5 = drawable5.getColor();
        int colorId6 = drawable6.getColor();
        int colorId7 = drawable7.getColor();
        int colorId8 = drawable8.getColor();
        int colorId9 = drawable9.getColor();

        if (colorId1 == Color.GREEN && colorId2 == Color.GREEN && colorId3 == Color.GREEN) {gameOver(p1);}
        if (colorId4 == Color.GREEN && colorId5 == Color.GREEN && colorId6 == Color.GREEN) {gameOver(p1);}
        if (colorId7 == Color.GREEN && colorId8 == Color.GREEN && colorId9 == Color.GREEN) {gameOver(p1);}
        if (colorId1 == Color.GREEN && colorId4 == Color.GREEN && colorId7 == Color.GREEN) {gameOver(p1);}
        if (colorId2 == Color.GREEN && colorId5 == Color.GREEN && colorId8 == Color.GREEN) {gameOver(p1);}
        if (colorId3 == Color.GREEN && colorId6 == Color.GREEN && colorId9 == Color.GREEN) {gameOver(p1);}
        if (colorId1 == Color.GREEN && colorId5 == Color.GREEN && colorId9 == Color.GREEN) {gameOver(p1);}
        if (colorId3 == Color.GREEN && colorId5 == Color.GREEN && colorId7 == Color.GREEN) {gameOver(p1);}

        if (colorId1 == Color.RED && colorId2 == Color.RED && colorId3 == Color.RED) {gameOver(p2);}
        if (colorId4 == Color.RED && colorId5 == Color.RED && colorId6 == Color.RED) {gameOver(p2);}
        if (colorId7 == Color.RED && colorId8 == Color.RED && colorId9 == Color.RED) {gameOver(p2);}
        if (colorId1 == Color.RED && colorId4 == Color.RED && colorId7 == Color.RED) {gameOver(p2);}
        if (colorId2 == Color.RED && colorId5 == Color.RED && colorId8 == Color.RED) {gameOver(p2);}
        if (colorId3 == Color.RED && colorId6 == Color.RED && colorId9 == Color.RED) {gameOver(p2);}
        if (colorId1 == Color.RED && colorId5 == Color.RED && colorId9 == Color.RED) {gameOver(p2);}
        if (colorId3 == Color.RED && colorId5 == Color.RED && colorId7 == Color.RED) {gameOver(p2);}
        if (count == 9) {gameOver(p3);}
    }

    public void gameOver(String player) {
        CustomDialogClass cdd = new CustomDialogClass(MainActivity.this, player);
        cdd.show();
        reset();
    }

    public void reset() {
        b1.setBackgroundColor(Color.WHITE);
        b2.setBackgroundColor(Color.WHITE);
        b3.setBackgroundColor(Color.WHITE);
        b4.setBackgroundColor(Color.WHITE);
        b5.setBackgroundColor(Color.WHITE);
        b6.setBackgroundColor(Color.WHITE);
        b7.setBackgroundColor(Color.WHITE);
        b8.setBackgroundColor(Color.WHITE);
        b9.setBackgroundColor(Color.WHITE);
        count = 0;
    }

}
