package com.nanodegree.example.appportfolio;

import android.content.DialogInterface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnFirstPort;
    private Button btnSecondPort;
    private Button btnThirdPort;
    private Button btnFourthPort;
    private Button btnFifthPort;
    private Button btnCapstonePort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.app_name);


        btnFirstPort = (Button) findViewById(R.id.btn_first_port);
        btnSecondPort = (Button) findViewById(R.id.btn_second_port);
        btnThirdPort = (Button) findViewById(R.id.btn_third_port);
        btnFourthPort = (Button) findViewById(R.id.btn_fourth_port);
        btnFifthPort = (Button) findViewById(R.id.btn_fifth_port);
        btnCapstonePort = (Button) findViewById(R.id.btn_capstone);

        btnFirstPort.setOnClickListener(this);
        btnSecondPort.setOnClickListener(this);
        btnThirdPort.setOnClickListener(this);
        btnFourthPort.setOnClickListener(this);
        btnFifthPort.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.setting_menu, menu);
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_first_port:
                showToast("this button will lunch my streamer app");
                break;
            case R.id.btn_second_port:
                showToast("this button will lunch my scores app");
                break;
            case R.id.btn_third_port:
                showToast("this button will lunch my library app");
                break;
            case R.id.btn_fourth_port:
                showToast("this button will lunch my bigger app");
                break;
            case R.id.btn_fifth_port:
                showToast("this button will lunch my reader app");
                break;
        }
    }

    private Toast toast;
    private void showToast(String text) {
        if (toast == null) {
            toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);
        } else {
            toast.setText(text);
        }
        toast.show();
    }
}
