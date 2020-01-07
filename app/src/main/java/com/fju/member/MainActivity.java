package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText nickname = findViewById(R.id.nickname);
        EditText agename = findViewById(R.id.agename);
        EditText gendername = findViewById(R.id.gendername);
            Intent intent = new Intent();
            intent = intent.setClass(MainActivity.this, NicknameActivity.class);
            startActivity(intent);

        }
    }
