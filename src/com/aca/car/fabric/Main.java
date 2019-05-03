package com.aca.car.fabric;

import com.aca.car.fabric.car.features.design.AbstractInteriorExterior;
import com.aca.car.fabric.car.features.design.CarDesign;
import com.aca.car.fabric.car.features.design.exterior.enumExterior.ExteriorColor;
import com.aca.car.fabric.car.features.design.interior.enumInterior.InteriorColor;
import com.aca.car.fabric.car.features.properties.AbstractCarProperties;
import com.aca.car.fabric.car.features.properties.CarProperties;
import com.aca.car.fabric.car.features.properties.enumProperties.CarClass;
import com.aca.car.fabric.car.features.properties.enumProperties.Engine;
import com.aca.car.fabric.car.features.properties.enumProperties.Wheels;
import com.aca.car.fabric.input.features.InputFeatures;

public class Main {
    public static void main(String[] args) {
        InputFeatures inputFeatures = new InputFeatures();
        SelectedFeatures selectedFeatures = new SelectedFeatures();
        selectedFeatures.typeClass();


        selectedFeatures.carTypesAbstract.doorNum();
        selectedFeatures.carTypesAbstract.seatsNum();
        selectedFeatures.carTypesAbstract.tireNum();

        AbstractCarProperties abstractCarProperties = new CarProperties();

        CarClass carClass = inputFeatures.inputCarClass();
        Engine engine = inputFeatures.inputEngine();
        Wheels wheels = inputFeatures.inputWheels();
        ExteriorColor exteriorColor = inputFeatures.inputExteriorColor();
        InteriorColor interiorColor = inputFeatures.inputInteriorColor();
        int year = inputFeatures.inputYear();

        abstractCarProperties.carClass(carClass);
        abstractCarProperties.engine(engine);
        abstractCarProperties.wheels(wheels);
        abstractCarProperties.years(year);

        AbstractInteriorExterior abstractInteriorExterior = new CarDesign();

        abstractInteriorExterior.exteriorColor(exteriorColor);
        abstractInteriorExterior.interiorColor(interiorColor);
    }
}
