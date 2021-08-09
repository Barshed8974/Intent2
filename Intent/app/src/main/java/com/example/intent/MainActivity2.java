package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private static final int CAMERA_REQUEST = 1888;
    TextView tvName;
    TextView tvName1;
    TextView Age;
    Button btnCam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvName=findViewById(R.id.tvName);
        tvName1=findViewById(R.id.tvName1);
        Age=findViewById(R.id.tvAge);
        btnCam=findViewById(R.id.btnCamera);
        tvName.setText(getIntent().getStringExtra("Name"));
        tvName1.setText(getIntent().getStringExtra("Name1"));
        Age.setText(getIntent().getStringExtra("Age"));
        btnCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                try {
                    startActivityForResult(intent,CAMERA_REQUEST);
                }
                catch (ActivityNotFoundException e){

                }
            }
        });
    }
}