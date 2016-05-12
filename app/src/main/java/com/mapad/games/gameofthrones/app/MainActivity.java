package com.mapad.games.gameofthrones.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MSG ="com.mapad.games.gameofthrones.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view)
    {
//        Intent intention = new Intent(this,DisplayMessageActivity.class);
        Intent intention = new Intent(this,BoardActivity.class);
        EditText ed = (EditText) findViewById(R.id.edit_message);
        String msg = ed.getText().toString();
        intention.putExtra(EXTRA_MSG,msg);
        startActivity(intention);
    }
}
