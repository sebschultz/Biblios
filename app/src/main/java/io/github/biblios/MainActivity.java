package io.github.biblios;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private EditText bookTitle;
    private Button addBookTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookTitle = (EditText)findViewById(R.id.bookEditText);
        addBookTitle = (Button)findViewById(R.id.addBookTitle);

        //allows user to input title of book
        addBookTitle.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {
            String name = bookTitle.getText().toString();
            makeLibrary(name);
        }

        });
    }

    //instance makes a second screen
    private void makeLibrary(String name){
    Intent intent = new Intent(this, Library.class);
        Resources resources = getResources();
        String key = resources.getString(R.string.key_title);
        intent.putExtra(key, name);
        startActivity(intent);
    }
}
