package patterns.lesson3.services.impl;

import patterns.lesson3.services.Service;

public class SurgeryService implements Service {
    @Override
    public void run() {
        System.out.println("Лечение хирургом");
    }
}
