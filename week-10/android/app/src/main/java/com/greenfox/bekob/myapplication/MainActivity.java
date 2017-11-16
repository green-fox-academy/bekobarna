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

        Button sendButton = (Button) findViewById(R.id.button);
        ListView listView = (ListView) findViewById(R.id.ListView);
        final EditText editText = (EditText) findViewById(R.id.EditText);

        final MessageAdapter messageAdapter = new MessageAdapter(getApplicationContext());


        Message message1 = new Message("god", "hi");
        Message message2 = new Message("god2", "hi");
        Message message3 = new Message("god3", "hi");

        messageAdapter.addAll(message1, message2, message3);

        listView.setAdapter(messageAdapter);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageAdapter.add(new Message("Barna", editText.getText().toString()));
            }
        });

    }
}
