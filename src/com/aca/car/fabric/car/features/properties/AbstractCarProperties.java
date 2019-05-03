package com.aca.car.fabric.car.features.properties;

import com.aca.car.fabric.car.features.properties.enumProperties.CarClass;
import com.aca.car.fabric.car.features.properties.enumProperties.Engine;
import com.aca.car.fabric.car.features.properties.enumProperties.Wheels;

public class AbstractCarProperties implements ICarProperties {
    @Override
    public void carClass(CarClass properties) {
    }

    @Override
    public void engine(Engine properties) {
    }

    @Override
    public void wheels(Wheels properties) {
    }


    @Override
    public void years(int year) {
    }
}
