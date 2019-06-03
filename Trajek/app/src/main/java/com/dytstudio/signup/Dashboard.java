package com.dytstudio.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mdkaromi.trajek.R;

public class Dashboard extends AppCompatActivity {

    TextView viewuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        viewuser = (TextView) findViewById(R.id.viewsuer);
        viewuser.setText(getIntent().getStringExtra("username"));
    }
}
