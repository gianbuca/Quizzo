package com.example.quizzo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartGame(View view){
        EditText editText= (EditText) findViewById(R.id.editText_userName);
        String userName=editText.getText().toString();
        Intent i=new Intent(this,MainGame.class);
        i.putExtra("user_name", userName);
        startActivity(i);
    }

}
