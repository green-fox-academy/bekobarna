package com.greenfox.bekob.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.greenfox.bekob.myapplication.adapter.MessageAdapter;
import com.greenfox.bekob.myapplication.model.Message;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendButton = findViewById(R.id.button);
        ListView listView = findViewById(R.id.ListView);
        final EditText editText = findViewById(R.id.EditText);

        final MessageAdapter messageAdapter = new MessageAdapter(getApplicationContext());

        listView.setAdapter(messageAdapter);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageAdapter.add(new Message("Barna", editText.getText().toString()));
            }
        });

    }

}
