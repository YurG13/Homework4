package com.aca.car.fabric.car.features.types;

import com.aca.car.fabric.car.features.types.car.ab.type.CarTypesAbstract;

public class Minivan extends CarTypesAbstract {
    @Override
    public void tireNum() {
        System.out.println("Minivan uni 4 aniv!");
    }

    @Override
    public void doorNum() {
        System.out.println("Minivan uni 5 door!");
    }

    @Override
    public void seatsNum() {
        System.out.println("Minivan uni 7 nstatex!");
    }
}
