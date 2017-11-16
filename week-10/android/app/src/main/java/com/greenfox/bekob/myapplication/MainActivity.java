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
import com.greenfox.bekob.myapplication.model.Received;
import com.greenfox.bekob.myapplication.service.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class MainActivity extends AppCompatActivity {
    Button sendButton;
    ListView listView;
   /* private ApiService service;
    List<Received> messages;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendButton = findViewById(R.id.button);
        listView = findViewById(R.id.ListView);
        final EditText editText = findViewById(R.id.EditText);

        final MessageAdapter messageAdapter = new MessageAdapter(getApplicationContext());
        listView.setAdapter(messageAdapter);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageAdapter.add(new Message("Barna", editText.getText().toString()));
            }
        });

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://bekobarnachatapp.herokuapp.com")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        /*service = retrofit.create(ApiService.class);

        service.getMessages().enqueue(new Callback<Received>() {
            @Override
            public void onResponse(Call<Received> call, Response<Received> response) {
                messages = response.body();
                messageAdapter.clear();
                messageAdapter.addAll(messages);
            }

            @Override
            public void onFailure(Call<Received> call, Throwable t) {
                messageAdapter.clear();
            }
        });*/

    }

}
