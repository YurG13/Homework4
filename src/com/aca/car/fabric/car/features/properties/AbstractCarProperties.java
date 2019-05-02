package com.aca.car.fabric.car.features.properties;

import com.aca.car.fabric.car.features.properties.enumProperties.CarClass;
import com.aca.car.fabric.car.features.properties.enumProperties.Engine;
import com.aca.car.fabric.car.features.properties.enumProperties.Wheels;

public class AbstractCarProperties implements ICarProperties {
    @Override
    public void carClass(CarClass properties) {
//        System.out.println("Car class is a " + type);
    }

    @Override
    public void engine(Engine properties) {
//        System.out.println("Car engine is a " + type);
    }

    @Override
    public void wheels(Wheels properties) {
//        System.out.println("Car wheel is a " + type);
    }


    @Override
    public void years(int year) {
//        System.out.println("Car year is a " + year);
    }
}
