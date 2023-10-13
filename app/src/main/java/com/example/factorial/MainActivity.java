package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void check(View v){
        EditText value = findViewById(R.id.et);
        String seq = value.getText().toString();
        int integer=Integer.parseInt(seq);
        TextView ans=findViewById(R.id.tv1);
        int factorial=1;
        for(int i=2;i<=integer;i++){
            factorial*=i;
        }
        ans.setText("Factorial of "+Integer.toString(integer)+" is "+Integer.toString(factorial));
    }
}