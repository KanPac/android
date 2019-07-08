package com.ict.ex04_view;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myview);
        textView1 = findViewById(R.id.tv1);
        textView2 = findViewById(R.id.tv2);

        textView2.setTextColor(Color.BLUE);
        textView2.setText("KOREA seoul");
        textView2.setTextSize(40);

        String msg = textView1.getText().toString();
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
