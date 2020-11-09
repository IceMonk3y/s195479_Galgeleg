package com.example.galgeleg_s195479.view;

import android.annotation.SuppressLint;
import android.icu.lang.UCharacter;
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
import android.widget.TextView;

import com.example.galgeleg_s195479.R;

import org.w3c.dom.Text;


public class MainMenuFrag extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.main_menu, container, false);

        Button shiftButton = root.findViewById(R.id.main_skift_ord_btn);
        Button newGameButton = root.findViewById(R.id.main_newGameButton);
        Button highscoreButton = root.findViewById(R.id.main_highscoreButton);

        TextView wordSource = root.findViewById(R.id.main_textView_Ord_Location);

        shiftButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (wordSource.getText().toString().equals("Dr.dk")){
                    wordSource.setText("Excel");
                }
                else if (wordSource.getText().toString().equals("Excel")){
                    wordSource.setText("Dr.dk");
                }
            }
        });

        newGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = wordSource.getText().toString();
                MainMenuFragDirections.ActionStartNewGame action = MainMenuFragDirections.actionStartNewGame(text);
                Navigation.findNavController(v).navigate(action);
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