package com.aca.car.fabric.car.features.types;


import com.aca.car.fabric.car.features.types.car.ab.type.CarTypesAbstract;

public class Hatchback extends CarTypesAbstract {

    @Override
    public void tireNum() {
        System.out.println("Hatchback car has 4 tire!");
    }

    @Override
    public void doorNum() {
        System.out.println("Hatchback car has 3 door!");
    }

    @Override
    public void seatsNum() {
        System.out.println("Hatchback car has 5 seats!");
    }
}
