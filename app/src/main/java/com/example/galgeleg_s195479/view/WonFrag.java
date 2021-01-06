package com.example.galgeleg_s195479.view;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.provider.MediaStore;
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

import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

public class WonFrag extends Fragment {
    private Galgelogik gl = Galgelogik.getInstance();
    private IHighscorePref IHighscorePref;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.won, container, false);
        MediaPlayer player = MediaPlayer.create(getContext(),R.raw.kidscheering);
        player.start();

        // PT. fejl med confetti.
        /*final KonfettiView konfettiView = root.findViewById(R.id.viewKonfetti);
        konfettiView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                konfettiView.build()
                        .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA)
                        .setDirection(0.0, 359.0)
                        .setSpeed(1f, 5f)
                        .setFadeOutEnabled(true)
                        .setTimeToLive(2000L)
                        .addShapes(Shape.Square.INSTANCE, Shape.Circle.INSTANCE)
                        .addSizes(new Size(12, 5f))
                        .setPosition(-50f, konfettiView.getWidth() + 50f, -50f, -50f)
                        .streamFor(300, 5000L);
            }
        });*/

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