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
import android.widget.ImageView;
import android.widget.TextView;

import com.example.galgeleg_s195479.R;
import com.example.galgeleg_s195479.logik.Galgelogik;

import org.w3c.dom.Text;

public class GameFrag extends Fragment {
    private Galgelogik gl = Galgelogik.getInstance();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.game, container, false);

        TextView welcomeUser = root.findViewById(R.id.textViewWelcomeUser);
        welcomeUser.setText(String.format("%s","Velkommen " + gl.getName() ));


        /*Update Image
        *Initialize buttons (gør grå/ usynlig)
        *Update (samme?)
        *Update text
        * Skriv toast.
        * */
        return root;
    }


    private void Image(View v){
        ImageView imgV =v.findViewById(R.id.imageViewHang);
        switch (gl.getAntalForkerteBogstaver()){
            default:
                imgV.setImageResource(R.drawable.galge);

            case 1:
                imgV.setImageResource(R.drawable.forkert1);
                break;
            case 2:
                imgV.setImageResource(R.drawable.forkert2);
                break;
            case 3:
                imgV.setImageResource(R.drawable.forkert3);
                break;
            case 4:
                imgV.setImageResource(R.drawable.forkert1);
                break;
            case 5:
                imgV.setImageResource(R.drawable.forkert5);
                break;
            case 6:
                imgV.setImageResource(R.drawable.forkert6);
                break;
        }
    }
    private void listenButton(View v) {

        Button a = v.findViewById(R.id.buttonA);
        a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                checkLetter(v,"a");
            }
        });

    }


    private  void checkLetter(View v,String letter){
        gl.gætBogstav(letter);
        if (gl.erSpilletTabt()){
            Navigation.findNavController(v).navigate(R.id.action_gameFrag_to_lostFrag);
        }
        if (gl.erSpilletVundet()){
            Navigation.findNavController(v).navigate(R.id.action_gameFrag_to_wonFrag);
        }
        /*currLetters.setText(gl.getSynligtOrd());
        showToaster();
        updateImage(v);
        updateButtons(v);*/
  }
}