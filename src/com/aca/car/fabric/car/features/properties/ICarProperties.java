package com.aca.car.fabric.car.features.properties;

import com.aca.car.fabric.car.features.properties.enumProperties.CarClass;
import com.aca.car.fabric.car.features.properties.enumProperties.Engine;
import com.aca.car.fabric.car.features.properties.enumProperties.Wheels;

public interface ICarProperties {
    void carClass(CarClass properties);
    void engine(Engine properties);
    void wheels(Wheels properties);
    void years(int year);
}
