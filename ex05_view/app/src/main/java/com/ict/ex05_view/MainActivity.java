package com.ict.ex05_view;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView1, textView2, textView3, textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);

        // 클릭 이벤트
        // public void onClick(View view)를 가지고 있는 클래스 지정
        textView1.setOnClickListener(this);

        // 2. 클릭 이벤트
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView3.setText("KOREA");
                textView3.setVisibility(View.VISIBLE);
                textView3.setTextColor(Color.RED);
            }
        });

        // 3. 클릭 이벤트
        textView3.setOnClickListener(new EventTest());

    }

    // implements View.OnClickListener
    @Override
    public void onClick(View view) {
        // View view는 이벤트가 발생한 뷰
        textView2.setText("대한민국");
        textView2.setVisibility(View.VISIBLE);
    }

    // 3. 클릭 이벤트를 위한 내부 클래스
    private class EventTest implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            textView4.setText("한국");
            textView4.setTextSize(10);
            textView4.setTextColor(Color.BLUE);

        }
    }

    // 4. 클릭 이벤트
    public void onClickTest(View view){
        Toast.makeText(this, "버튼을 누르셧네영", Toast.LENGTH_SHORT).show();
    }

}
