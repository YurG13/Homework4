package com.aca.car.fabric.car.features.properties;

import com.aca.car.fabric.car.features.properties.enumProperties.CarClass;
import com.aca.car.fabric.car.features.properties.enumProperties.Engine;
import com.aca.car.fabric.car.features.properties.enumProperties.Wheels;

public class CarProperties extends AbstractCarProperties {
    @Override
    public void carClass(CarClass type) {
        System.out.println("Class is a " + type);
    }

    @Override
    public void engine(Engine type) {
        System.out.println("Engine is a " + type);
    }

    @Override
    public void wheels(Wheels type) {
        System.out.println("Wheel is a " + type);
    }


    @Override
    public void years(int year) {
        System.out.println("Year is a " + year);
    }
}
