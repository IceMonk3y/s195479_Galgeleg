package com.example.galgeleg_s195479.logik;

public class FactoryOrdHenter {

    public OrdHenter lavOrdHenter(String type) {

        if (type.equals("Dr")) {
            return new DROrdlogik();
        } else if (type.equals("Excel")) {
            return new ExelOrdlogik();
        }
        return null;
    }
}

