package com.intellinds.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtEmail;
    private EditText edtPassword;
    private Button btnLogin;

    private static final String EMAIL = "user@gmail.com";
    private static final String PASSWORD = "user@gmail.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edtEmail.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();
                checkLogin(email, password);
            }
        });
    }

    private void initUI() {
        edtEmail = findViewById(R.id.main_email_editText);
        edtPassword = findViewById(R.id.main_password_editText);
        btnLogin = findViewById(R.id.main_login_button);
    }

    private void checkLogin(String email, String password) {
        if (email.isEmpty()) {
            Toast.makeText(this, "Enter email!", Toast.LENGTH_SHORT).show();
        } else if (password.isEmpty()) {
            Toast.makeText(this, "Enter password!", Toast.LENGTH_SHORT).show();
        } else if (!email.equals(EMAIL)) {
            Toast.makeText(this, "Invalid email or password!", Toast.LENGTH_SHORT).show();
        } else if (!password.equals(PASSWORD)) {
            Toast.makeText(this, "Invalid email or password!", Toast.LENGTH_SHORT).show();
        } else {
            // Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("EMAIL_KEY", email);
            startActivity(intent);
        }
    }
}
