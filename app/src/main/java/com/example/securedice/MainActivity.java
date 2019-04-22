package com.example.securedice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.ArrayList;
//import java.util.Random;
//import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {
    //public static final String EXTRA_MESSAGE = "wordCount";
    String flags = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            case R.id.check_char:
                if (checked) {
                    flags += "Char";
                    //flags.add("Char");
                }
                break;
            case R.id.check_num:
                if (checked) {
                    flags += "Num";
                    //flags.add("Num");
                }
                break;
        }
    }

    /** Called when the user taps the Generate button */
    public void generatePhrase(View view) {
        Intent intent = new Intent(this, GeneratePhraseActivity.class);
        EditText totalWords = (EditText)findViewById(R.id.totalWords);
        String word = totalWords.getText().toString();
        intent.putExtra("WordCount", word);
        intent.putExtra("Flags", flags);
        startActivity(intent);
    }

    /** Called when the user taps the Import button */
    public void importList(View view) {
        Intent intent = new Intent(this, ImportListActivity.class);
        startActivity(intent);
    }
}
