package com.example.securedice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import java.util.Random;
//import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Generate button */
    public void generatePhrase(View view) {
        Intent intent = new Intent(this, GeneratePhraseActivity.class);
        startActivity(intent);
    }

    /** Called when the user taps the Import button */
    public void importList(View view) {
        Intent intent = new Intent(this, ImportListActivity.class);
        startActivity(intent);
    }
}
