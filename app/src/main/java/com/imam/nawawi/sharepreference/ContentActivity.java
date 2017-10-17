package com.imam.nawawi.sharepreference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    TextView hText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        hText = (TextView)findViewById(R.id.con_view);
        hText.setText(getIntent().getStringExtra("myText"));
    }
}
