package com.example.welcome.butterknifeexamplewithfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StartActivity extends AppCompatActivity {
    @Bind(R.id.txtShowData)
    TextView shwTxt;

    @Bind(R.id.btnShow)
    Button showBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.btnShow)
    public void buttonJob() {
        shwTxt.setText("ButterKnife button  joined later");
    }
}
