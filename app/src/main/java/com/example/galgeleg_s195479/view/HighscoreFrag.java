package com.example.galgeleg_s195479.view;

import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.galgeleg_s195479.R;
import com.example.galgeleg_s195479.data.Highscore;
import com.example.galgeleg_s195479.data.HighscorePrefManager;
import com.example.galgeleg_s195479.data.IHighscorePref;
import com.example.galgeleg_s195479.logik.Galgelogik;

import java.util.List;
import java.util.Objects;

public class HighscoreFrag extends Fragment {
    private Galgelogik gl = Galgelogik.getInstance();
    private IHighscorePref IHighscorePref;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;


    SharedPreferences sp;
    String[] highscoreArr;
    ListView listView;


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        IHighscorePref = new HighscorePrefManager(getActivity());
        View root = inflater.inflate(R.layout.highscore, container, false);
        recyclerView = root.findViewById(R.id.listView);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(layoutManager);


        List<Highscore> highScores = IHighscorePref.getScore();
        String[] highScoresStringArray = highScores.stream()
                .map(x -> String.format("%s\t\t%s", x.getName(), x.getScore()))
                .toArray(String[]::new);

        mAdapter = new MyAdapter(highScoresStringArray);

        return root;
    }
}

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private String[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView textView;
        public MyViewHolder(View v) {
            super(v);
            textView = v.findViewById(R.id.listView);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.highscore, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.textView.setText(mDataset[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}

/*
        IHighscorePref = new HighscorePrefManager(getActivity());
        View root = inflater.inflate(R.layout.highscore, container, false);

        sp = getActivity().getApplicationContext().getSharedPreferences("Winners", Context.MODE_PRIVATE);
        int gamesCount = sp.getInt("gamesCount", 0);

       highscoreArr = new String[gamesCount];

        if(!(gamesCount == 0)){
            for (int j = 0; j <gamesCount ;j++) {
                String navn = sp.getString("navn_gamesCount" + j, "(Navn)");
                int forkerte = sp.getInt("antalForkerte_gamesCount" + j, 0);
                String orderet = sp.getString("orderet_gameCount" + j, "(orderet)");

                highscoreArr[j] = navn + " havde " + forkerte + " forkerte ord" +"\n" + "Orderet var: " + orderet;

            }
        }

        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, highscoreArr);
        listView = root.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return root;
    }*/