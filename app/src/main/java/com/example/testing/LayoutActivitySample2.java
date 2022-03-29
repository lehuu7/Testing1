package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class LayoutActivitySample2 extends AppCompatActivity {
    private Button  Editprofile;
            Button Showmyfacebook;
            Button Showmyinstagram;
            Button imagebutton;
            Button imagebutton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_sample2);
        getSupportActionBar().setTitle("Testing");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Editprofile = (Button) findViewById(R.id.Editprofile);
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.imageButton:
                        Toast.makeText(LayoutActivitySample2.this, "https://www.facebook.com/BLACKPINK.JISOO", Toast.LENGTH_SHORT).show();
                        break;}}});
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.imageButton4:
                        Toast.makeText(LayoutActivitySample2.this, "https://www.instagram.com/sooyaaa__/", Toast.LENGTH_SHORT).show();
                        break;
                }}});
        Showmyfacebook = findViewById(R.id.Showmyfacebook);
        Showmyinstagram = findViewById(R.id.Showmyinstagram);
        Showmyfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.facebook.com/BLACKPINK.JISOO");
            }
        });
        Showmyinstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/sooyaaa__/");
            }
        });}
            private void gotoUrl(String s) {
            Uri uri=Uri.parse(s);
            startActivity(new Intent(Intent.ACTION_VIEW,uri));

        Editprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LayoutActivitySample2.this, LayoutActivitySample3.class);
                startActivity(intent);
                }});}}