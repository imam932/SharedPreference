package com.imam.nawawi.sharepreference;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends Activity {

    Button btn;
    String txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        addListenerOnButton();
    }

    public void addListenerOnButton(){
        btn = (Button) findViewById(R.id.btn_post);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.txt_post);
                String text = editText.getText().toString();

                Intent myintent = new Intent(view.getContext(), ContentActivity.class);
                myintent.putExtra("myText", text);
                startActivity(myintent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.activity_home, menu);
        return true;
    }
}
