package com.aca.car.fabric.car.features.design;

import com.aca.car.fabric.car.features.design.exterior.enumExterior.ExteriorColor;
import com.aca.car.fabric.car.features.design.interior.enumInterior.InteriorColor;

public class CarDesign extends AbstractInteriorExterior {
    @Override
    public void exteriorColor(ExteriorColor eColor) {
        System.out.println("Exterior Color is a " + eColor);
    }

    @Override
    public void interiorColor(InteriorColor iColor) {
        System.out.println("Interior Color is a " + iColor);
    }
}
