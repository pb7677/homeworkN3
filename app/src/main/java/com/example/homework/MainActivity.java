package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    int num =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button);
    }

    public void btn(View view) {
        num++;
        btn1.setText("This is a click number: "+num);
        if (num==6){
            btn1.setText("Enough to click. Go to new start!");
            num=0;
        }
    }
}