package com.devss.apipractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Post> {

    private Context mContext;
    private int mResource;

    public ListAdapter(Context context, int resource, ArrayList<Post> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String userId = String.valueOf(getItem(position).getUserId());
        String id = String.valueOf(getItem(position).getId());
        String title = getItem(position).getTitle();
        String body = getItem(position).getBody();

//        Post post = new Post(userId, id, title, body);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvUserId = convertView.findViewById(R.id.user_id);
        TextView tvId = convertView.findViewById(R.id.id);
        TextView tvTitle = convertView.findViewById(R.id.title);
        TextView tvBody = convertView.findViewById(R.id.body);

        tvUserId.setText(userId);
        tvId.setText(id);
        tvTitle.setText(title);
        tvBody.setText(body);

        return convertView;
    }
}
