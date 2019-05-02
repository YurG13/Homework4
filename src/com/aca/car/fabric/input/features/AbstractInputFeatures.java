package com.aca.car.fabric.input.features;

import com.aca.car.fabric.car.features.design.exterior.enumExterior.ExteriorColor;
import com.aca.car.fabric.car.features.design.interior.enumInterior.InteriorColor;
import com.aca.car.fabric.car.features.properties.enumProperties.CarClass;
import com.aca.car.fabric.car.features.properties.enumProperties.Engine;
import com.aca.car.fabric.car.features.properties.enumProperties.Wheels;
import com.aca.car.fabric.car.features.types.enumTypes.CarType;

public class AbstractInputFeatures implements IInputFeatures{
    @Override
    public CarType inputTypeCar() {
        return null;
    }

    @Override
    public CarClass inputCarClass() {
        return null;
    }

    @Override
    public Engine inputEngine() {
        return null;
    }

    @Override
    public Wheels inputWheels() {
        return null;
    }

    @Override
    public ExteriorColor inputExteriorColor() {
        return null;
    }

    @Override
    public InteriorColor inputInteriorColor() {
        return null;
    }
}
