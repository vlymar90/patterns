package patterns;

import patterns.lesson3.app.Application;
import patterns.lesson3.factory.impl.SurgeryFactory;
import patterns.lesson3.factory.impl.TherapyFactory;
import patterns.lesson5.patient.Patient;
import patterns.lesson5.service.impl.SurgeryDepartment;
import patterns.lesson5.service.impl.TherapyDepartment;


/**
 * Реализация паттерна стратегия
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Лечение у терапевта.");
        Patient.getTreatment(new TherapyDepartment());

        System.out.println("Лечение у хирурга.");
        Patient.getTreatment(new SurgeryDepartment());
    }
}
