package com.mapad.games.gameofthrones.app;

import android.app.Fragment;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String msg = intent.getStringExtra(MainActivity.EXTRA_MSG);
        TextView tv = new TextView(this);
        tv.setText(msg);
        tv.setTextSize(40);
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content);
        layout.addView(tv);
//        layout.
    }
}
    class PlaceHolderFragment extends Fragment {
        @Override
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle savedInstanceState)
        {
//            super.onCreateView(layoutInflater,viewGroup,savedInstanceState);
//            setContentView(R.layout.place_holder);
            return layoutInflater.inflate(R.layout.place_holder,viewGroup,false);
        }

    }

