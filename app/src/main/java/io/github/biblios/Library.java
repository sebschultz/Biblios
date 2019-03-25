package io.github.biblios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;


public class Library extends AppCompatActivity {

    public static final String TAG = Library.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        Intent intent = getIntent();
        String bookTitle = intent.getStringExtra(getString(R.string.key_title));
        if (bookTitle == null || bookTitle.isEmpty()) {
             bookTitle = "Add a Title";}
        Log.d(TAG, bookTitle);
    }
}
