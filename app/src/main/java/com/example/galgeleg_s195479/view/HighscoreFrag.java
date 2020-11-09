package com.example.galgeleg_s195479.view;
import android.app.Person;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import com.example.galgeleg_s195479.R;
import com.example.galgeleg_s195479.data.Highscore;
import com.example.galgeleg_s195479.data.HighscorePrefManager;
import com.example.galgeleg_s195479.data.IHighscorePref;
import com.example.galgeleg_s195479.view.HighscoreAdapter;

import java.util.ArrayList;
// todo : Kan stadig ikke få highscore til at fungere. (Roddet forsøg basis) --> Baseret på https://www.youtube.com/watch?v=E6vE8fqQPTE&t=372s&ab_channel=CodingWithMitch
public class HighscoreFrag extends Fragment {
    private IHighscorePref IHighscorePref;

    private  static final String TAG  = "MaiAct";

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.highscore, container, false);
        Log.d(TAG, "onCreate: Started. ");

        IHighscorePref = new HighscorePrefManager(getActivity());


        ListView myListView = root.findViewById(R.id.listView);
        ArrayList<Highscore> highScores = (ArrayList<Highscore>) IHighscorePref.getScore();


        // HighscoreAdapter adapter = new HighscoreAdapter(this, R.layout.adapter_view_layout, highScores);
        // myListView.setAdapter(adapter);

        return root;
    }
}




