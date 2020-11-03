package com.example.galgeleg_s195479.data;

import java.util.List;

public interface IHighscorePref {
        void saveScore(Highscore highscore);
        List<Highscore> getScore();
    }
