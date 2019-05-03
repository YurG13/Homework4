package com.aca.car.fabric;

import com.aca.car.fabric.car.features.properties.enumProperties.CarClass;
import com.aca.car.fabric.car.features.types.*;
import com.aca.car.fabric.car.features.types.car.ab.type.CarTypesAbstract;
import com.aca.car.fabric.input.features.InputFeatures;

public class SelectedFeatures extends InputFeatures{
    CarTypesAbstract carTypesAbstract;

    public void typeClass() {
        switch (inputTypeCar()) {
            case Sedan:
                carTypesAbstract = new Sedan();
                break;
            case Motorcycle:
                carTypesAbstract = new Motorcycle();
                break;
            case Hatchback:
                carTypesAbstract = new Hatchback();
                break;
            case Minivan:
                carTypesAbstract = new Minivan();
                break;
            case Truck:
                carTypesAbstract = new Truck();
                break;
            case Tractor:
                carTypesAbstract = new Tractor();
                break;
                default:
                    carTypesAbstract = null;
        }
    }
}
