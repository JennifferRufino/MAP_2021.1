package main;

import factories.SanduicheFactory;
import models.sanduiches.Sanduiche;
import models.sanduiches.SanduicheTipo;

public class Main {

    public static void main(String[] args) {
        SanduicheFactory factory = new SanduicheFactory();

        System.out.println("Sanduiches:");
        Sanduiche s1 = factory.getSanduiche(SanduicheTipo.INTEGRAL);
        System.out.println(s1.toString());

        Sanduiche s2 = factory.getSanduiche(SanduicheTipo.CHEDDAR_NATURAL);
        System.out.println(s2.toString());

        Sanduiche s3 = factory.getSanduiche(SanduicheTipo.CAIPIRA);
        System.out.println(s3.toString());
    }
}