package com.example.testing;

import android.app.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class LayoutActivitySample<listener, btnPress> extends Activity {
    private static String profileId;
    EditText editUserName, editPassword;
    Button btnLogin;
    EditText editText1;
    Button Back;
    TextView textView;
    TextView textView1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_sample);
        editUserName = (EditText) findViewById(R.id.Username);
        editPassword = (EditText) findViewById(R.id.Password);
        btnLogin = (Button) findViewById(R.id.JoinorLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                String Username = "admin";
                String Password = "admin";
                if (editUserName.getText().length() != 0 && editPassword.getText().length() != 0) {
                    if (editUserName.getText().toString().equals(Username) && editPassword.getText().toString().equals(Password)) {
                        Toast.makeText(LayoutActivitySample.this, R.string.login_success, Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(LayoutActivitySample.this, LayoutActivitySample2.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(LayoutActivitySample.this, R.string.login_error, Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(LayoutActivitySample.this, "Mời bạn nhập đủ thông tin", Toast.LENGTH_LONG).show();
                }

            }
            ;
        });
        EditText editText1 = findViewById(R.id.Username);
        EditText editText2 = findViewById(R.id.Password);
        editText1.setOnEditorActionListener(editorActionListener);
        editText2.setOnEditorActionListener(editorActionListener);

    }

    private TextView.OnEditorActionListener editorActionListener = new TextView.OnEditorActionListener() {
        @Override
        public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
            switch (actionId) {
                case EditorInfo.IME_ACTION_NEXT:
                    Toast.makeText(LayoutActivitySample.this, "Next", Toast.LENGTH_SHORT).show();
                    break;
                case EditorInfo.IME_ACTION_DONE:
                    Toast.makeText(LayoutActivitySample.this, "Done", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LayoutActivitySample.this, LayoutActivitySample2.class);
                    startActivity(intent);
                    break;
            }
            return false;
        }
    };
    public void hideKeyboard(View view) {
        InputMethodManager inputMethodManager=(InputMethodManager)  getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0);
    }}





