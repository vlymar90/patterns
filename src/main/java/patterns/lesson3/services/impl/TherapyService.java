package patterns.lesson3.services.impl;

import patterns.lesson3.services.Service;

public class TherapyService implements Service {
    @Override
    public void run() {
        System.out.println("Начало лечения терапевтом");
    }
}
