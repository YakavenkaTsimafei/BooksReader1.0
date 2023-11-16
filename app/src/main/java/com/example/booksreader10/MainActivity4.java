package com.example.booksreader10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent intent = getIntent();
        String fileUri = intent.getStringExtra("fileUri");

        if (fileUri.endsWith(".pdf")) {
            //  openPdfBook(fileUri);
        }
    }

//    private void openPdfBook(String fileUri) {
//        FolioReader folioReader = FolioReader.get();
//    }
}