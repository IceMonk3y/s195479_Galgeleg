package com.example.galgeleg_s195479.data;

import java.util.ArrayList;
import java.util.HashSet;

public interface IHighscorePref {
        void saveScore(Highscore highscore);
        ArrayList<HashSet> getScore();
    }
