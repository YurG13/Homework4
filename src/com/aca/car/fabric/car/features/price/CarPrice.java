package com.aca.car.fabric.car.features.price;

import com.aca.car.fabric.car.features.properties.enumProperties.CarClass;
import com.aca.car.fabric.car.features.properties.enumProperties.Engine;
import com.aca.car.fabric.car.features.properties.enumProperties.Wheels;
import com.aca.car.fabric.car.features.types.enumTypes.CarType;

public class CarPrice extends DetailPrice{
    public double price = 0.0;

    public void priceType(CarType type) {
        switch (type) {
            case Motorcycle:
                price += motorcycle;
                break;
            case Hatchback:
                price += hatchback;
                break;
            case Sedan:
                price += sedan;
                break;
            case Minivan:
                price += minivan;
                break;
            case Truck:
                price += truck;
                break;
            case Tractor:
                price += tractor;
                break;
                default:
                    break;
        }
    }

    public void classPrice(CarClass type) {
        switch (type) {
            case Electric:
                price += price*electric/100;
                break;
            case Sportcar:
                price += price*sportcar/100;
                break;
            case Buisness:
                price += price*buisness/100;
                break;
                default:
                    break;
        }
    }

    public void enginePrice(Engine type) {
        switch (type) {
            case Diesel:
                price += price*diesel/100;
                break;
            case Petrol:
                price += price*petrol/100;
                break;
            case Hybrid:
                price += price*hybrid/100;
                break;
            case Electrical:
                price += price*electric/100;
                break;
                default:
                    break;
        }
    }

    public void wheelsPrice(Wheels type) {
        switch (type) {
            case Jeep:
                price += price*jeep/100;
                break;
            case Back_Wheel_Drive:
                price += price*jeep/100;
                break;
            case Front_Wheel_Drive:
                price += price*jeep/100;
                break;
        }
    }

    public void yearPrice(int year) {
        if (year < 2005) {
            price += price*2/100;
        } else if (year < 2010) {
            price += price*5/100;
        } else if (year < 2015) {
            price += price*10/100;
        } else {
            price += price*15/100;
        }
    }
}
