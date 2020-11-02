package com.example.galgeleg_s195479.view;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.galgeleg_s195479.R;


public class MainMenuFrag extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.main_menu, container, false);

        Button newGameButton = root.findViewById(R.id.main_newGameButton);
        Button highscoreButton = root.findViewById(R.id.main_highscoreButton);

        newGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_startNewGame);
            }
        });

        highscoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_openHighscore);
            }
        });

        // Todo: Undersøg hvornår nedenståeende er nødvendigt - hvis det er?

       /* OnBackPressedCallback callback = new OnBackPressedCallback(true *//* enabled by default *//*) {
            @Override
            public void handleOnBackPressed() {
                getActivity().finish();
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(this, callback);*/
        return root;
    }
}