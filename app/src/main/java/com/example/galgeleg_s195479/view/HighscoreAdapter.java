package com.example.galgeleg_s195479.view;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.galgeleg_s195479.R;
import com.example.galgeleg_s195479.data.Highscore;

import java.util.ArrayList;

public class HighscoreAdapter extends ArrayAdapter<Highscore> {
    // todo : Kan stadig ikke få highscore til at fungere. (Roddet forsøg basis)

    private Context mContext;
    int mResource;


    public HighscoreAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Highscore> objects) {
        super(context, resource, objects);
        mContext  = context;
        mResource  = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String name = getItem(position).getName();
        Integer score = getItem(position).getScore();

        Highscore highscore = new Highscore(score, name );
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView  = inflater.inflate(mResource,parent,false);

        TextView tvName = (TextView) convertView.findViewById(R.id.textViewName);
        TextView tvScore = (TextView) convertView.findViewById(R.id.textView2Score);

        tvName.setText(name);
        tvScore.setText(score);

        return convertView;
    }
}
