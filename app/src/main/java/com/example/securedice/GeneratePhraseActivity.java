package com.example.securedice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class GeneratePhraseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_phrase);
        //char word = randomGenerator();
        //String[] randomWords = {"Aaaa", "Bbbb", "Cccccc", "Dddddd"};
        final TextView outputList = (TextView) findViewById(R.id.listOutput);
        outputList.setText("Word"); //set text for text view
    }
    int randomGenerator() {
        Random generator = new Random(System.nanoTime());
        int rand = generator.nextInt(4);
        return rand;
    }
}
