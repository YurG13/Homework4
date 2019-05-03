package com.aca.car.fabric.car.features.types;

import com.aca.car.fabric.car.features.types.car.ab.type.CarTypesAbstract;

public class Minivan extends CarTypesAbstract {
    @Override
    public void tireNum() {
        System.out.println("Minivan car has 4 tire!");
    }

    @Override
    public void doorNum() {
        System.out.println("Minivan car has 5 doors!");
    }

    @Override
    public void seatsNum() {
        System.out.println("Minivan car has 7 seats!");
    }
}
