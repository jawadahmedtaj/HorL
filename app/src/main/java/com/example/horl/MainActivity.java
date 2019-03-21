package com.example.horl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rand = new Random();
    int randomNumber;

    public void makeToast(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    public void guess(View view) {
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);

        int Uguess = Integer.parseInt(guessEditText.getText().toString());

        if (Uguess > randomNumber)
        {
        makeToast("Lower!!");
        }
        else if (Uguess < randomNumber){
            makeToast("Higher!!");
        }
        else
        {
            makeToast("You guessed correct!! Try again");
            randomNumber = rand.nextInt(20) + 1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomNumber = rand.nextInt(20) + 1;
    }
}
