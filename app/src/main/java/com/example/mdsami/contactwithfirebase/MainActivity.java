package com.example.mdsami.contactwithfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements LogInDialogFragment.EmployeeInfo, SignUpDialogFragment.ManagementInfo , LogInDialogFragment.UserLogInInfo {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
