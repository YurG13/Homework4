package com.aca.car.fabric.car.features.types;

import com.aca.car.fabric.car.features.types.car.ab.type.CarTypesAbstract;

public class Truck extends CarTypesAbstract {
    @Override
    public void tireNum() {
        System.out.println("Truck car has  6 tire!");
    }

    @Override
    public void doorNum() {
        System.out.println("Truck car has 2 door!");
    }

    @Override
    public void seatsNum() {
        System.out.println("Truck car has 3 seats!");
    }
}
