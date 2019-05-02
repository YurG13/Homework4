package com.aca.car.fabric;

import com.aca.car.fabric.car.features.design.AbstractInteriorExterior;
import com.aca.car.fabric.car.features.design.CarDesign;
import com.aca.car.fabric.car.features.design.exterior.enumExterior.ExteriorColor;
import com.aca.car.fabric.car.features.design.interior.enumInterior.InteriorColor;
import com.aca.car.fabric.car.features.properties.AbstractCarProperties;
import com.aca.car.fabric.car.features.properties.CarProperties;
import com.aca.car.fabric.car.features.properties.enumProperties.CarClass;
import com.aca.car.fabric.car.features.properties.enumProperties.Engine;
import com.aca.car.fabric.car.features.properties.enumProperties.Wheels;
import com.aca.car.fabric.car.features.types.Motorcycle;
import com.aca.car.fabric.car.features.types.car.ab.type.CarTypesAbstract;
import com.aca.car.fabric.car.features.types.enumTypes.CarType;

public class Main {
    public static void main(String[] args) {
        CarTypesAbstract carTypesAbstract = new Motorcycle();

        carTypesAbstract.doorNum();
        carTypesAbstract.seatsNum();
        carTypesAbstract.tireNum();

        AbstractCarProperties abstractCarProperties = new CarProperties(CarType.Motorcycle);

        abstractCarProperties.carClass(CarClass.Buisness);
        abstractCarProperties.engine(Engine.Diesel);
        abstractCarProperties.wheels(Wheels.Back_Wheel_Drive);
        abstractCarProperties.years(2019);

        AbstractInteriorExterior abstractInteriorExterior = new CarDesign();

        abstractInteriorExterior.exteriorColor(ExteriorColor.Blue);
        abstractInteriorExterior.interiorColor(InteriorColor.Any_Color);
    }
}
