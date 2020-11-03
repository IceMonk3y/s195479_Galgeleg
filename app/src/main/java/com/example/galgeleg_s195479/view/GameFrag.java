package com.example.galgeleg_s195479.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
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
    private TextView currentgeusses;
    private Button a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v1, w, x, y, z, æ, ø, å;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.game, container, false);
        gl.nulstil();
        Log.d("Ord2",gl.getOrdet());

        TextView welcomeUser = root.findViewById(R.id.textViewWelcomeUser);
        welcomeUser.setText(String.format("%s","Velkommen " + gl.getName() ));

        imageUpd(root);
        listenButton(root);
        buttonUpd(root);
        currentgeusses = root.findViewById(R.id.textViewGeusses);
        currentgeusses.setText(gl.getSynligtOrd());


        /*
        * Todo : Skriv toast.
        * */

        return root;
    }
    private void imageUpd(View v){
        ImageView imgV =(ImageView) v.findViewById(R.id.imageViewHang);
        switch (gl.getAntalForkerteBogstaver() ){
            case 0:
                imgV.setImageResource(R.drawable.galge);
                break;
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
                imgV.setImageResource(R.drawable.forkert4);
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
        a = v.findViewById(R.id.buttonA);
        a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) { checkLetter(v,"a"); }
        });
        b = v.findViewById(R.id.buttonB);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"b");
            }
        });
        c = v.findViewById(R.id.buttonC);
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"c");
            }
        });
        d = v.findViewById(R.id.buttonD);
        d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"d");
            }
        });
        e = v.findViewById(R.id.buttonE);
        e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"e");
            }
        });
        f = v.findViewById(R.id.buttonF);
        f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"f");
            }
        });
        g = v.findViewById(R.id.buttonG);
        g.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"g");
            }
        });
        h = v.findViewById(R.id.buttonH);
        h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"h");
            }
        });
        i = v.findViewById(R.id.buttonI);
        i.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"i");
            }
        });
        j = v.findViewById(R.id.buttonJ);
        j.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"j");
            }
        });
        k = v.findViewById(R.id.buttonK);
        k.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"k");
            }
        });
        l = v.findViewById(R.id.buttonL);
        l.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"l");
            }
        });
        m = v.findViewById(R.id.buttonM);
        m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"m");
            }
        });
        n = v.findViewById(R.id.buttonN);
        n.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"n");
            }
        });
        o = v.findViewById(R.id.buttonO);
        o.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"o");
            }
        });
        p = v.findViewById(R.id.buttonP);
        p.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"p");
            }
        });
        q = v.findViewById(R.id.buttonQ);
        q.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"q");
            }
        });
        r = v.findViewById(R.id.buttonR);
        r.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"r");
            }
        });
        s = v.findViewById(R.id.buttonS);
        s.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"s");
            }
        });
        t = v.findViewById(R.id.buttonT);
        t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"t");
            }
        });
        u = v.findViewById(R.id.buttonU);
        u.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"u");
            }
        });
        v1 = v.findViewById(R.id.buttonV);
        v1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"v");
            }
        });
        w = v.findViewById(R.id.buttonW);
        w.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"w");
            }
        });
        x = v.findViewById(R.id.butttonX);
        x.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"x");
            }
        });
        y = v.findViewById(R.id.buttonY);
        y.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"y");
            }
        });
        z = v.findViewById(R.id.buttonZ);
        z.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"z");
            }
        });
        æ = v.findViewById(R.id.buttonÆ);
        æ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"æ");
            }
        });
        ø = v.findViewById(R.id.buttonØ);
        ø.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"ø");
            }
        });
        å = v.findViewById(R.id.buttonÅ);
        å.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                checkLetter(v,"å");
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
        currentgeusses.setText(gl.getSynligtOrd());
        imageUpd(v);
        buttonUpd(v);
  }

  private void buttonUpd(View v){
      if(gl.getBrugteBogstaver().contains("a")){
          a.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("b")){
          b.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("c")){
          c.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("d")){
          d.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("e")){
          e.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("f")){
          f.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("g")){
          g.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("h")){
          h.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("i")){
          i.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("j")){
          j.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("k")){
          k.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("l")){
          l.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("m")){
          m.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("n")){
          n.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("o")){
          o.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("p")){
          p.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("q")){
          q.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("r")){
          r.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("s")){
          s.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("t")){
          t.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("u")){
          u.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("v")) {
          v1.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("w")){
          w.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("x")){
          x.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("y")){
          y.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("z")){
          z.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("æ")){
          æ.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("ø")){
          ø.setVisibility(View.INVISIBLE);
      }
      if(gl.getBrugteBogstaver().contains("å")){
          å.setVisibility(View.INVISIBLE);
      }
  }
  }
