package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    EditText etName1;
    EditText etAge;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName=findViewById(R.id.etName);
        etName1=findViewById(R.id.etName1);
        etAge=findViewById(R.id.etAge);
        next=findViewById(R.id.btnNext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Name",etName.getText().toString());
                intent.putExtra("Name1",etName1.getText().toString());
                intent.putExtra("Age",etAge.getText().toString());
                startActivity(intent);
            }
        });
    }
}