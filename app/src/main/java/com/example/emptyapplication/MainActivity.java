package com.example.emptyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

/**
 *
 * class MainActivity
 *
 * This is the main class for the "Empty Application" app.
 *
 * This is an app that counts the number of times a user presses a button.
 *
 */

public class MainActivity extends AppCompatActivity {

    private static int internalCounter = 0;

    private String generateText(){
        StringBuilder sb = new StringBuilder();

        sb.append("You have pressed the button ");
        sb.append(internalCounter);
        sb.append(" time");

        if(internalCounter > 1){
            sb.append("s");
        }

        sb.append("!");

        return sb.toString();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b = findViewById(R.id.button);
        final TextView outputTextField = findViewById(R.id.textView);

        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                internalCounter++;
                outputTextField.setText(generateText());

            }

        });

    }
}
