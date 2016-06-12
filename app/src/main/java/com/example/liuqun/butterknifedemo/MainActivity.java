package com.example.liuqun.butterknifedemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button)
    Button   button;
    @BindView(R.id.button2)
    Button   button2;
    @BindView(R.id.button3)
    Button   button3;
    @BindView(R.id.textView)
    TextView textView;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.button, R.id.button2, R.id.button3, R.id.textView})
    public void onClick(View view) {
        fragment = new BlankFragment();
        switch (view.getId()) {
            case R.id.button:
                Toast.makeText(MainActivity.this, "第一个Button", Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.content_main,
                        fragment).commit();
                break;
            case R.id.button2:
                Toast.makeText(MainActivity.this, "第二个Button", Toast
                        .LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(MainActivity.this, "第三个Button", Toast
                        .LENGTH_SHORT).show();
                break;
            case R.id.textView:
                Toast.makeText(MainActivity.this, "TextView", Toast
                        .LENGTH_SHORT)
                        .show();
                break;
        }
    }
}
