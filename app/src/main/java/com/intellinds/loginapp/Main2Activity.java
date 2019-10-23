package com.intellinds.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvMessage = findViewById(R.id.main2_message_textView);
        String message = "Hello " + getIntent().getStringExtra("EMAIL_KEY");
        tvMessage.setText(message);

    }
}
