package com.aca.car.fabric.input.features;

import com.aca.car.fabric.car.features.design.exterior.enumExterior.ExteriorColor;
import com.aca.car.fabric.car.features.design.exterior.enumExterior.InConsolExtColor;
import com.aca.car.fabric.car.features.design.interior.enumInterior.InteriorColor;
import com.aca.car.fabric.car.features.properties.enumProperties.CarClass;
import com.aca.car.fabric.car.features.properties.enumProperties.Engine;
import com.aca.car.fabric.car.features.properties.enumProperties.Wheels;
import com.aca.car.fabric.car.features.types.enumTypes.CarType;

import java.util.Arrays;
import java.util.Scanner;

public class InputFeatures extends AbstractInputFeatures {
    Scanner sc = new Scanner(System.in);

    @Override
    public CarType inputTypeCar() {
        String type;
        System.out.println("\n\n" + Arrays.toString(CarType.values()));
        System.out.print("\n@ntrel car type ver@ nshvac tarberakneric : ");


        while (true) {
            type = sc.nextLine();
            try {
                CarType.valueOf(type);
                return CarType.valueOf(type);
            } catch (IllegalArgumentException e) {
                System.out.print("Aydpisi dasht goyutyun chuni @ntreq noric : ");
            }
        }
    }

    @Override
    public CarClass inputCarClass() {
        String type;
        System.out.println("\n\n" + Arrays.toString(CarClass.values()));
        System.out.print("\n@ntrel car Class@ ver@ nshvac tarberakneric : ");


        while (true) {
            type = sc.nextLine();
            try {
                CarClass.valueOf(type);
                return CarClass.valueOf(type);
            } catch (IllegalArgumentException e) {
                System.out.print("Aydpisi dasht goyutyun chuni @ntreq noric : ");
            }
        }
    }

    @Override
    public Engine inputEngine() {
        String type;
        System.out.println("\n\n" + Arrays.toString(Engine.values()));
        System.out.print("\n@ntrel car Class@ ver@ nshvac tarberakneric : ");


        while (true) {
            type = sc.nextLine();
            try {
                Engine.valueOf(type);
                return Engine.valueOf(type);
            } catch (IllegalArgumentException e) {
                System.out.print("Aydpisi dasht goyutyun chuni @ntreq noric : ");
            }
        }
    }

    @Override
    public Wheels inputWheels() {
        String type;
        System.out.println("\n\n" + Arrays.toString(Wheels.values()));
        System.out.print("\n@ntrel car Class@ ver@ nshvac tarberakneric : ");


        while (true) {
            type = sc.nextLine();
            try {
                Wheels.valueOf(type);
                return Wheels.valueOf(type);
            } catch (IllegalArgumentException e) {
                System.out.print("Aydpisi dasht goyutyun chuni @ntreq noric : ");
            }
        }
    }

    @Override
    public ExteriorColor inputExteriorColor() {
        String type;
        System.out.println("\n\n" + Arrays.toString(ExteriorColor.values()));
        System.out.print("\n@ntrel car Class@ ver@ nshvac tarberakneric : ");


        while (true) {
            type = sc.nextLine();
            try {
                ExteriorColor.valueOf(type);
                return ExteriorColor.valueOf(type);
            } catch (IllegalArgumentException e) {
                System.out.print("Aydpisi dasht goyutyun chuni @ntreq noric : ");
            }
        }
    }

    @Override
    public InteriorColor inputInteriorColor() {
        String type;
        System.out.println("\n\n" + Arrays.toString(InteriorColor.values()));
        System.out.print("\n@ntrel car Class@ ver@ nshvac tarberakneric : ");


        while (true) {
            type = sc.nextLine();
            try {
                InteriorColor.valueOf(type);
                return InteriorColor.valueOf(type);
            } catch (IllegalArgumentException e) {
                System.out.print("Aydpisi dasht goyutyun chuni @ntreq noric : ");
            }
        }
    }

    public int inputYear() {
        System.out.print("\n@ntrel Car Date : ");
        return sc.nextInt();
    }

}
