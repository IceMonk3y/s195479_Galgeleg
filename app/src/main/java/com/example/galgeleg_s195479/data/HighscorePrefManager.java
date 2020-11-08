package com.example.galgeleg_s195479.data;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HighscorePrefManager implements IHighscorePref {
    private Activity act;

    public HighscorePrefManager(Activity act) {
        this.act = act;
    }

    @Override
    public void saveScore(Highscore highscore) {
        SharedPreferences share = act.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = share.edit();
        edit.putInt(highscore.getName(), highscore.getScore());
        System.out.println(highscore.getName());
        System.out.println(highscore.getScore());
    }


    @Override
    public List<Highscore> getScore() {
        SharedPreferences sharedPref = act.getPreferences(Context.MODE_PRIVATE);
        List<Highscore> highscoreList = new ArrayList<>();

        Map<String, ?> key = sharedPref.getAll();
        for (Map.Entry<String, ?> entry : key.entrySet()) {
            Highscore newHigh = new Highscore(Integer.parseInt(entry.getValue().toString()), entry.getKey());
            highscoreList.add(newHigh);
        }
        return highscoreList;
    }
}