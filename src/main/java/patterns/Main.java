package patterns;

import patterns.lesson3.app.Application;
import patterns.lesson3.factory.impl.SurgeryFactory;
import patterns.lesson3.factory.impl.TherapyFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Лечение в терапии: ");
        Application appTherapy = new Application(new TherapyFactory());
        appTherapy.treatment();

        System.out.println("Лечение в хирургии: ");
        Application appSurgery = new Application(new SurgeryFactory());
        appSurgery.treatment();
    }
}
