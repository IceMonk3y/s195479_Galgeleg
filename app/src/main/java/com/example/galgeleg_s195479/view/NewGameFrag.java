package com.example.galgeleg_s195479.view;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.galgeleg_s195479.R;
import com.example.galgeleg_s195479.logik.DROrdlogik;
import com.example.galgeleg_s195479.logik.ExelOrdlogik;
import com.example.galgeleg_s195479.logik.FactoryOrdHenter;
import com.example.galgeleg_s195479.logik.Galgelogik;

import org.w3c.dom.Text;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class NewGameFrag extends Fragment {
    private Galgelogik gl = Galgelogik.getInstance();
    Executor bgThread = Executors.newSingleThreadExecutor();
    Handler frThread = new Handler();
    String sourceString;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, final Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.new_game, container, false);

        final TextView nameTe = root.findViewById(R.id.chooseTextName);
        final Button start = root.findViewById(R.id.buttonStart);

        nameTe.setText(gl.getName());

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameTe.getText().toString();

                if (name.length() < 1) {
                    Context context = v.getContext();
                    CharSequence text = "Indtast dit navn";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else {
                    gl.setName(name);
                    gl.nulstil();
                    bgThread.execute(()-> {
                        try {
                            FactoryOrdHenter factory = new FactoryOrdHenter();
                            gl.setOrdhenter(factory.lavOrdHenter(sourceString));
                            gl.hentOrd();
                            frThread.post(()->{
                                Navigation.findNavController(v).navigate(R.id.action_GAME);
                            });
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
                }
            }
        });
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @NonNull Bundle savedInstanceState ){
        super.onViewCreated(view, savedInstanceState);
        NewGameFragArgs args = NewGameFragArgs.fromBundle(getArguments());
        sourceString = args.getWordSource();
        Log.d("text" , sourceString);
    }

}