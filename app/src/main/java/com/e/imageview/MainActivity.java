package com.e.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton rbRajesh, rbDaya, rbBhuwan;
    private ImageView imgHero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbRajesh = findViewById(R.id.rbRajesh);
        rbDaya = findViewById(R.id.rbDaya);
        rbBhuwan = findViewById(R.id.rbBhuwan);
        imgHero = findViewById(R.id.imgHero);

        rbRajesh.setOnClickListener(this);
        rbDaya.setOnClickListener(this);
        rbBhuwan.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rbRajesh:
                break;

            case R.id.rbDaya :
                break;

            case R.id.rbBhuwan:
                break;

        }
    }
}
