package org.launchcode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        OpticalDisc gladiator = new DVD("Gladiator", 500, 400);

        OpticalDisc recovery = new CD("Recovery", 200, 180);

        ArrayList<OpticalDisc> discs = new ArrayList<>();
        discs.add(gladiator);
        discs.add(recovery);

        for(OpticalDisc disc: discs){
            disc.readData();
        }

    }
}