package com.aca.car.fabric.car.features.types;

import com.aca.car.fabric.car.features.types.car.ab.type.CarTypesAbstract;

public class Sedan extends CarTypesAbstract {
    @Override
    public void tireNum() {
        System.out.println("Sedan car has 4 tire!");
    }

    @Override
    public void doorNum() {
        System.out.println("Sedan car has 5 door!");
    }

    @Override
    public void seatsNum() {
        System.out.println("Sedan car has  5 seats!");
    }
}
