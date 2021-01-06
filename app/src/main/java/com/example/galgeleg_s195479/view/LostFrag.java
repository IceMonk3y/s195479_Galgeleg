package com.example.galgeleg_s195479.view;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.galgeleg_s195479.R;
import com.example.galgeleg_s195479.logik.Galgelogik;


public class LostFrag extends  Fragment {
    private Galgelogik gl = Galgelogik.getInstance();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.lost, container, false);
        MediaPlayer player = MediaPlayer.create(getContext(),R.raw.losesound);
        player.start();

        TextView rightWordMes = root.findViewById(R.id.textViewRightWord);
        Button newGame = root.findViewById(R.id.buttonL_NewGame);

        String mes = "Det rigtige ord var : "+ gl.getOrdet();

        rightWordMes.setText(mes);

        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_restartGame_L);
            }
        });
        return root;
    }
}