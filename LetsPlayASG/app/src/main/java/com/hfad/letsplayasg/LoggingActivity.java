package com.hfad.letsplayasg;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoggingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logging);
    }

    public void onLoginClick(View view){
        //Jeżeli weryfikacja konta przebiegła pomyślnie
        EditText text = (EditText) findViewById(R.id.username);
        String username = text.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("username", username);
        startActivity(intent);
    }

    public void onRegisterClick(View view){
    Intent registrationIntent = new Intent(this, RegistrationActivity.class);
    startActivity(registrationIntent);
    }
}
