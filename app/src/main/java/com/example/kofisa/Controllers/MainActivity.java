package com.example.kofisa.Controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kofisa.R;

public class MainActivity extends AppCompatActivity {

    private Button butonnRegister;
    private EditText editEmail;
    private EditText editPassword;
    private TextView textViewSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.configureButtonRegistrer();
        this.configureEditTextEditTextEmail();
        this.configureEditTextPassword();
        this.configureTextViewSignUp();
    }

    private void configureButtonRegistrer(){
        // Serialise ImageView
        this.butonnRegister = (Button) this.findViewById(R.id.butConnexion);
        // Set OnClick Listener on it
        butonnRegister.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Launch Detail Activity
                //launchHomeActivity();
            }
        });
    }

    private void configureEditTextEditTextEmail(){
        // Serialise ImageView
        this.editEmail = (EditText) this.findViewById(R.id.editEmail);
        // Set OnClick Listener on it
        /*imageViewOC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Launch Detail Activity
                //launchDetailActivity();
            }
        });*/
    }

    private void configureEditTextPassword(){
        // Serialise ImageView
        this.editPassword = (EditText) this.findViewById(R.id.editPassword);
        // Set OnClick Listener on it
        /*editPassword.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Launch Detail Activity
                launchDetailActivity();
            }
        });*/
    }

    private void configureTextViewSignUp(){
        // Serialise ImageView
        this.textViewSignUp = (TextView) this.findViewById(R.id.textViewSignUp);
        // Set OnClick Listener on it
        textViewSignUp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Launch Detail Activity
                //launchDetailActivity();
            }
        });
    }

    // ----

   /* private void launchDetailActivity(){
        Intent myIntent = new Intent(MainActivity.this, DetailActivity.class);
        this.startActivity(myIntent);
    }*/
}
