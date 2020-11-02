package com.example.galgeleg_s195479.view;

import android.content.Context;
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
import android.widget.Toast;

import com.example.galgeleg_s195479.R;
import com.example.galgeleg_s195479.logik.Galgelogik;

import org.w3c.dom.Text;

public class NewGameFrag extends Fragment {
    private Galgelogik gl = Galgelogik.getInstance();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.new_game, container, false);

        final TextView nameTe = root.findViewById(R.id.chooseTextName);
        Button start = root.findViewById(R.id.buttonStart);

        nameTe.setText(gl.getName());

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name =nameTe.getText().toString();

                if (name.length() < 1){
                    Context context = v.getContext();
                    CharSequence text = "Indtast dit navn";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else{
                    gl.setName(name);
                    Navigation.findNavController(v).navigate(R.id.action_GAME);
                }
            }
        });

        return root;
    }
}