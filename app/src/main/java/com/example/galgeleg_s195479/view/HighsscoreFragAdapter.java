package com.example.galgeleg_s195479.view;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.galgeleg_s195479.R;

import java.util.ArrayList;
import java.util.HashSet;


public class HighsscoreFragAdapter extends ArrayAdapter<String> {
    private Context context;
    private ArrayList<HashSet> ord;


    public HighsscoreFragAdapter(@NonNull Context context, @NonNull ArrayList<HashSet> ord){
        super(context,0,new ArrayList<>());
        this.context = context;
        this.ord = ord;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null) {
            // Vi inflater layoutet som vi har lavet i xml
            listItem = LayoutInflater.from(context).inflate(R.layout.adapter_view_layout, parent, false);
        }

        HashSet names = ord.get(0);
        HashSet scores = ord.get(1);

        Object[] set2Name = names.toArray();
        Object[] set2Scores = scores.toArray();

        Log.d("List",set2Name.toString());
        Log.d("List",set2Scores.toString());
        Log.d("test","test");

        TextView nameView = listItem.findViewById(R.id.textViewName);
        nameView.setText(set2Name[position]+"");

        TextView scoreView = listItem.findViewById(R.id.textViewScore);
        nameView.setText(set2Scores[position]+"");

        return listItem;
    }

}