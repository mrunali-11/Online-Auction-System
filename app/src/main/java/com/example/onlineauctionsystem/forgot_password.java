package com.example.onlineauctionsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class forgot_password extends AppCompatActivity {
    private EditText emailet;
    private Button reset_BT;
    private ProgressBar progressBar;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        emailet = (EditText) findViewById(R.id.forgottenemail);
        reset_BT = (Button) findViewById(R.id.reset_bt);
        progressBar = (ProgressBar) findViewById(R.id.progressBar3);
        auth = FirebaseAuth.getInstance();
        reset_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetPassword();
            }
        });
    }

    private void resetPassword() {
        String email = emailet.getText().toString().trim();
        if(email.isEmpty()){
            emailet.setError("Email is required");
            emailet.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            emailet.setError("Please provide valid email");
            return;
        }
        progressBar.setVisibility(View.VISIBLE);
        auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    Toast.makeText(forgot_password.this,"Check your email to reset your password",Toast.LENGTH_LONG).show();

                }else{
                    Toast.makeText(forgot_password.this,"Try Again! Something went wrong!",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}