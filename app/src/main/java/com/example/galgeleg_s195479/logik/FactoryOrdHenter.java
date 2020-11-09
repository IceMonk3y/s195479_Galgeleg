package com.example.galgeleg_s195479.logik;

import android.util.Log;

public class FactoryOrdHenter {

    public OrdHenter lavOrdHenter(String type) {

        if (type.equals("Dr.dk")) {
            Log.d("text", "Logik");
            return new DROrdlogik();

        } else if (type.equals("Excel")) {
            return new ExelOrdlogik();
        }
        Log.d("text" , "Factory_problems");
        return null;
    }
}

