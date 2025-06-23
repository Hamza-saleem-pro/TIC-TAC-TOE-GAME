package com.example.tictactoe;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Game_Screen extends AppCompatActivity {

    boolean flag = false;
    int count = 0;
    boolean winnerFound = false;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, reset;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        initialize();

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset_result(v);
            }
        });
    }

    private void initialize() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        reset = findViewById(R.id.reset);
        result = findViewById(R.id.result);
    }

    @SuppressLint("SetTextI18n")
    public void Check(View view) {
        Button btn = (Button) view;
        if (btn.getText().toString().isEmpty()) {
            count++;
            if (!flag) {
                btn.setText("X");
                flag = true;
            } else {
                btn.setText("O");
                flag = false;
            }

            if (count >= 5) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.isEmpty()) {
                    result.setText("The Winner is " + b1);
                    winnerFound = true;
                    new android.os.Handler().postDelayed(() -> reset_result(view), 2000);
                    return;
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.isEmpty()) {
                    result.setText("The Winner is " + b4);
                    winnerFound = true;
                    new android.os.Handler().postDelayed(() -> reset_result(view), 2000);
                    return;
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.isEmpty()) {
                    result.setText("The Winner is " + b7);
                    winnerFound = true;
                    new android.os.Handler().postDelayed(() -> reset_result(view), 2000);
                    return;
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.isEmpty()) {
                    result.setText("The Winner is " + b1);
                    winnerFound = true;
                    new android.os.Handler().postDelayed(() -> reset_result(view), 2000);
                    return;
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.isEmpty()) {
                    result.setText("The Winner is " + b2);
                    winnerFound = true;
                    new android.os.Handler().postDelayed(() -> reset_result(view), 2000);
                    return;
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.isEmpty()) {
                    result.setText("The Winner is " + b3);
                    winnerFound = true;
                    new android.os.Handler().postDelayed(() -> reset_result(view), 2000);
                    return;
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.isEmpty()) {
                    result.setText("The Winner is " + b1);
                    winnerFound = true;
                    new android.os.Handler().postDelayed(() -> reset_result(view), 2000);
                    return;
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.isEmpty()) {
                    result.setText("The Winner is " + b3);
                    winnerFound = true;
                    new android.os.Handler().postDelayed(() -> reset_result(view), 2000);
                    return;
                }
            }

            if (count == 9 && !winnerFound) {
                result.setText("The match is Draw");
                new android.os.Handler().postDelayed(() -> reset_result(view), 2000);
            }
        }
    }

    public void reset_result(View view) {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        result.setText("Result");
        flag = false;
        count = 0;
        winnerFound = false;
    }
}
