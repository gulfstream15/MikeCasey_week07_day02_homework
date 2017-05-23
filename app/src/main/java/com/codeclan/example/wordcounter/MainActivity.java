package com.codeclan.example.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText sentenceEditText;
    private Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(getClass().toString(), "about to set content view");
        setContentView(R.layout.activity_main);
        Log.d(getClass().toString(), "content view set");

        sentenceEditText = (EditText)findViewById(R.id.sentence_text);
    }

    public void onCountButtonClicked(View button) {
        Log.d(getClass().toString(), "Count button was clicked");
        String sentence = sentenceEditText.getText().toString();
        Log.d(getClass().toString(), "The sentence is: " + sentence);

        WordCount wordCount = new WordCount(sentence);
        int totalWords = wordCount.getWordCount(sentence);

        Intent intent = new Intent(this, WordActivity.class);
        intent.putExtra("Total number of words", totalWords);
        startActivity(intent);
    }

}
