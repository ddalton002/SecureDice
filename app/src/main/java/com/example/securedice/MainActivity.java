package com.example.securedice;

import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String flags = "";
    String selection = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AssetManager assetManager = getAssets();
        try {
            // for assets folder add empty string
            String[] filelist = assetManager.list("");
            // for assets/subFolderInAssets add only subfolder name
            String[] filelistInSubfolder = assetManager.list("subFolderInAssets");
            if (filelist == null) {
                // dir does not exist or is not a directory
            } else {
                for (int i=0; i<filelist.length; i++) {
                    // Get filename of file or directory
                    String filename = filelist[i];
                }
            }

            // if(filelistInSubfolder == null) ............

        } catch (IOException e) {
            e.printStackTrace();
        }

        Spinner spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        Resources res = getResources();
        //String [] placeholder = res.getStringArray(R.array.words_array);
        List<String> placeholder = new ArrayList<>(Arrays.asList(res.getStringArray(R.array.words_array)));

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("newName")) {
                String newName = extras.getString("newName");
                placeholder.add(newName);
            }
            if (extras.containsKey("newList")) {
                String newList = extras.getString("newList");
            }
        }

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, placeholder);
        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.words_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        selection = (String) parent.getItemAtPosition(pos);

    }

    public void onNothingSelected(AdapterView<?> parent) {
        selection = (String) parent.getItemAtPosition(1);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            case R.id.check_char:
                if (checked) {
                    flags += "Char";
                }
                break;
            case R.id.check_num:
                if (checked) {
                    flags += "Num";
                }
                break;
        }
    }

    /** Called when the user taps the Generate button */
    public void generatePhrase(View view) {
        Intent intent = new Intent(this, GeneratePhraseActivity.class);
        EditText totalWords = findViewById(R.id.totalWords);
        String word = totalWords.getText().toString();
        intent.putExtra("WordCount", word);
        intent.putExtra("Flags", flags);
        intent.putExtra("Selection", selection);
        startActivity(intent);
    }

    /** Called when the user taps the Import button */
    public void importList(View view) {
        Intent intent = new Intent(this, ImportListActivity.class);
        startActivity(intent);
    }
}
