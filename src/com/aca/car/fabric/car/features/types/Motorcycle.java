package com.aca.car.fabric.car.features.types;

import com.aca.car.fabric.car.features.types.car.ab.type.CarTypesAbstract;

public class Motorcycle extends CarTypesAbstract {
    @Override
    public void tireNum() {
        System.out.println("Motorcycle car has 2 tire!");
    }

//    @Override
//    public void doorNum() {
//        System.out.println("Hatchback@ uni 3 door!");
//    }

    @Override
    public void seatsNum() {
        System.out.println("Motorcycle car has 1 seats!");
    }
}
