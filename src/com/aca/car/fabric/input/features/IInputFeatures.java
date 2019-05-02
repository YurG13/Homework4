package com.aca.car.fabric.input.features;

import com.aca.car.fabric.car.features.design.exterior.enumExterior.ExteriorColor;
import com.aca.car.fabric.car.features.design.interior.enumInterior.InteriorColor;
import com.aca.car.fabric.car.features.properties.enumProperties.CarClass;
import com.aca.car.fabric.car.features.properties.enumProperties.Engine;
import com.aca.car.fabric.car.features.properties.enumProperties.Wheels;
import com.aca.car.fabric.car.features.types.enumTypes.CarType;

public interface IInputFeatures {
    CarType inputTypeCar();
    CarClass inputCarClass();
    Engine inputEngine();
    Wheels inputWheels();
    ExteriorColor inputExteriorColor();
    InteriorColor inputInteriorColor();



}
