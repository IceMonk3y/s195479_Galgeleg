package com.example.galgeleg_s195479.logik;

import java.util.ArrayList;

public interface IGalgelogik {
    public ArrayList<String> getBrugteBogstaver();
    public String getSynligtOrd();
    public String getOrdet();
    public int getAntalForkerteBogstaver();
    public boolean erSidsteBogstavKorrekt();
    public boolean erSpilletVundet();
    public boolean erSpilletTabt();
    public boolean erSpilletSlut();
    public String getName();
    public void setName(String name);

    public void nulstil();
    public void gætBogstav(String bogstav);
    public void logStatus();



}


