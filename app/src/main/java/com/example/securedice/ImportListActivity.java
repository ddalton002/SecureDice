package com.example.securedice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ImportListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_import_list);
    }

    //addButton.setOnClickListener(new View.OnClickListener() {
        //public void onClick(View v) {
            //Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            //intent.setType("*/*");
            //startActivityForResult(intent, PICKFILE_RESULT_CODE);
        //}
    //}
}

