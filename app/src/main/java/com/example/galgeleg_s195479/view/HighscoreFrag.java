package com.example.galgeleg_s195479.view;
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
import com.example.galgeleg_s195479.data.HighscorePrefManager;
import com.example.galgeleg_s195479.data.IHighscorePref;

public class HighscoreFrag extends Fragment {
    private IHighscorePref IHighscorePref;


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.highscore, container, false);

        IHighscorePref = new HighscorePrefManager(getActivity());
        ListView myListView = root.findViewById(R.id.listView);

        HighsscoreFragAdapter adapter = new HighsscoreFragAdapter(getContext(), IHighscorePref.getScore());
        myListView.setAdapter(adapter);
        return root;
    }
}







