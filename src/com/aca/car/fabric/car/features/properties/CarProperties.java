package com.aca.car.fabric.car.features.properties;

import com.aca.car.fabric.car.features.properties.enumProperties.CarClass;
import com.aca.car.fabric.car.features.properties.enumProperties.Engine;
import com.aca.car.fabric.car.features.properties.enumProperties.Wheels;
import com.aca.car.fabric.car.features.types.enumTypes.CarType;

public class CarProperties extends AbstractCarProperties {
    CarType carType;
    public CarProperties(CarType carType) {
        this.carType = carType;
    }
    @Override
    public void carClass(CarClass type) {
        System.out.println(carType + " class is a " + carType);
    }

    @Override
    public void engine(Engine type) {
        System.out.println(carType + " engine is a " + type);
    }

    @Override
    public void wheels(Wheels type) {
        System.out.println(carType + " wheel is a " + type);
    }


    @Override
    public void years(int year) {
        System.out.println(carType + " year is a " + year);
    }
}
