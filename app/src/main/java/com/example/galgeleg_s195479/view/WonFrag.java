package com.example.galgeleg_s195479.view;

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
import com.example.galgeleg_s195479.data.Highscore;
import com.example.galgeleg_s195479.data.HighscorePrefManager;
import com.example.galgeleg_s195479.data.IHighscorePref;
import com.example.galgeleg_s195479.logik.Galgelogik;

public class WonFrag extends Fragment {
    private Galgelogik gl = Galgelogik.getInstance();
    private IHighscorePref IHighscorePref;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.won, container, false);

        // Saved win to highscore-list:
        IHighscorePref = new HighscorePrefManager(this.getActivity());
        IHighscorePref.saveScore(new Highscore(gl.getAntalForkerteBogstaver(), gl.getName()));


        TextView amountTries = root.findViewById(R.id.textViewAmountTries);
        Button newGame = root.findViewById(R.id.buttonW_NewGame);


        String mes = "Du gættede " + gl.getAntalForkerteBogstaver() + " gange forkert";

        System.out.println(amountTries);

        amountTries.setText(mes);

        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_restartGame_w);
            }
        });
        return root;
    }

}