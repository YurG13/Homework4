package com.aca.car.fabric.car.features.types;

import com.aca.car.fabric.car.features.types.car.ab.type.CarTypesAbstract;

public class Tractor extends CarTypesAbstract {
    @Override
    public void tireNum() {
        System.out.println("Tractor car has 4 tire!");
    }

    @Override
    public void doorNum() {
        System.out.println("Tractor  car has 1 door!");
    }

    @Override
    public void seatsNum() {
        System.out.println("Tractor car has 1 seats!");
    }
}
