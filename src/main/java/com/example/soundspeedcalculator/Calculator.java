package com.example.soundspeedcalculator;

import java.util.Scanner;
import static java.lang.Math.*;

public class Calculator {
    public static void main(String[] args) {
        double OriginMass, Mass, Length, Diameter, Frequency;

        boolean fl = true;
        while (fl) {
            System.out.print("OriginMass,Mass,Length,Diameter,Frequency\n");
            Scanner input = new Scanner(System.in);

            OriginMass = input.nextDouble();
            Mass = input.nextDouble();
            Length = input.nextDouble();
            Diameter = input.nextDouble();
            Frequency = input.nextDouble();

            double SoundSpeed = 0.02 * PI * Frequency * sqrt(4 * (OriginMass - Mass) * (Length + 0.85 * Diameter) /(PI * Diameter * Diameter));
            double Error = (SoundSpeed - 346.3) / 346.3 * 100;
            System.out.printf("SoundSpeed = %.2f m/s, Error = %.2f%%\n",SoundSpeed,Error);

            System.out.println("continue?");
            Scanner in = new Scanner(System.in);
            fl = in.nextBoolean();

        }
    }
}
