package com.aca.car.fabric.car.features.types;

import com.aca.car.fabric.car.features.types.car.ab.type.CarTypesAbstract;

public class Truck extends CarTypesAbstract {
    @Override
    public void tireNum() {
        System.out.println("Truck@ uni 6 aniv!");
    }

    @Override
    public void doorNum() {
        System.out.println("Truck@ uni 2 door!");
    }

    @Override
    public void seatsNum() {
        System.out.println("Truck@ uni 3 nstatex!");
    }
}
