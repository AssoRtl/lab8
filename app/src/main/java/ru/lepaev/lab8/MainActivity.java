package ru.lepaev.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tvBottom = (TextView) findViewById(R.id.textView);
        TextView tvBottom1 = (TextView) findViewById(R.id.editTextTextPersonName);


        tvBottom1.setText("Вставте текст");
        tvBottom.setText("Текст");


    }
}