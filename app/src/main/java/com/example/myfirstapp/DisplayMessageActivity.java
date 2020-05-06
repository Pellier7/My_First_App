package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com. example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, Main3Activity.class);
        //EditText editText = (EditText) findViewById(R.id.textView);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
