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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.galgeleg_s195479.R;

import org.w3c.dom.Text;


public class MainMenuFrag extends Fragment {
    String from;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.main_menu, container, false);

        Button newGameButton = root.findViewById(R.id.main_newGameButton);
        Button highscoreButton = root.findViewById(R.id.main_highscoreButton);
        Spinner dropDown = root.findViewById(R.id.create_dropDown);

        ArrayAdapter<CharSequence> dropDownAdapter = ArrayAdapter.createFromResource(getContext(),R.array.createDropDown, R.layout.support_simple_spinner_dropdown_item);
        dropDownAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropDown.setAdapter(dropDownAdapter);

        dropDown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //set the newly selected type to local string
                 from = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });



        newGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainMenuFragDirections.ActionStartNewGame action = MainMenuFragDirections.actionStartNewGame(from);
                Navigation.findNavController(v).navigate(action);
            }
        });

        highscoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_openHighscore);
            }
        });

        return root;
    }

}