package com.example.galgeleg_s195479.data;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashSet;

public class HighscorePrefManager implements IHighscorePref {
    private Activity act;

    public HighscorePrefManager(Activity act) {
        this.act = act;
    }

    @Override
    public void saveScore(Highscore highscore) {
        SharedPreferences share = act.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = share.edit();

        HashSet<String> nameSet = (HashSet<String>) share.getStringSet("nameSet", new HashSet<>());
        HashSet<String> scoreSet = (HashSet<String>) share.getStringSet("scoreSet", new HashSet<>());

        nameSet.add(highscore.getName() + " " + nameSet.size());
        scoreSet.add(highscore.getScore()+" " + scoreSet.size());

        edit.putStringSet("nameSet", nameSet);
        edit.apply();
        edit.putStringSet("scoreSet", scoreSet);
        edit.apply();
    }

    @Override
    public ArrayList<HashSet> getScore() {
        SharedPreferences sharedPref = act.getPreferences(Context.MODE_PRIVATE);

        HashSet<String> nameSet = (HashSet<String>) sharedPref.getStringSet("nameSet",new HashSet<>());
        HashSet<String> scoreSet = (HashSet<String>) sharedPref.getStringSet("scoreSet",new HashSet<>());

        ArrayList<HashSet> highscoreList = new ArrayList<>();
        highscoreList.add(nameSet);
        highscoreList.add(scoreSet);

        Log.d("List ", String.valueOf(highscoreList));
        return highscoreList;
    }
}