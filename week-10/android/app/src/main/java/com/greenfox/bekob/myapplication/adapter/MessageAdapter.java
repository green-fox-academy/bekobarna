package com.greenfox.bekob.myapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.greenfox.bekob.myapplication.R;
import com.greenfox.bekob.myapplication.model.Message;


/**
 * Created by bekob on 2017-11-16.
 */

public class MessageAdapter extends ArrayAdapter<Message> {

    public MessageAdapter(@NonNull Context context) {
        super(context, 0);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Message current = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.message, parent, false);
        }
        TextView username = (TextView) convertView.findViewById(R.id.username);
        username.setText(current.getUsername());
        TextView message = (TextView) convertView.findViewById(R.id.text);
        message.setText(current.getText());
        return convertView;
    }
}
