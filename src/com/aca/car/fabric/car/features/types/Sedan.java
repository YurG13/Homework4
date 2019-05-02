package com.aca.car.fabric.car.features.types;

import com.aca.car.fabric.car.features.types.car.ab.type.CarTypesAbstract;

public class Sedan extends CarTypesAbstract {
    @Override
    public void tireNum() {
        System.out.println("Sedan@ uni 4 aniv!");
    }

    @Override
    public void doorNum() {
        System.out.println("Sedan@ uni 5 door!");
    }

    @Override
    public void seatsNum() {
        System.out.println("Sedan@ uni 5 nstatex!");
    }
}
