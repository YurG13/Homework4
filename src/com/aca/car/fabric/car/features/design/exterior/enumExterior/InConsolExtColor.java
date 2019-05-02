package com.aca.car.fabric.car.features.design.exterior.enumExterior;

public class InConsolExtColor {
    public static String[] exteriorArray() {
        String[] exteriorColor = {"Beige",
                "Black",
                "Blue",
                "Brown",
                "Gold",
                "Gray",
                "Green",
                "Orange",
                "Pink",
                "Purple",
                "Red",
                "Silver",
                "White",
                "Yellow",
                "Other"
        };

        return exteriorColor;
    }

    public static void inConsol() {
        int i = 0;
        for (String color : exteriorArray()) {
            System.out.println(i + ": " + color);
            i++;
        }
    }
}
