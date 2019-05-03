package com.aca.car.fabric;

import com.aca.car.fabric.car.features.types.*;
import com.aca.car.fabric.car.features.types.car.ab.type.CarTypesAbstract;
import com.aca.car.fabric.car.features.types.enumTypes.CarType;
import com.aca.car.fabric.input.features.InputFeatures;

class SelectedFeatures extends InputFeatures{
    CarTypesAbstract carTypesAbstract;
    private CarType carType1 = inputTypeCar();

    public CarType getCarType1() {
        return carType1;
    }

    void typeClass() {
        switch (carType1) {
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
