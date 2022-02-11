package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddNote extends AppCompatActivity {
    EditText etNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        etNote = (EditText) findViewById(R.id.etNote);
    }

    public void onClick(View v) {
        Intent intent = new Intent();
        intent.putExtra("note", etNote.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}