package patterns.lesson5.service.impl;

import patterns.lesson5.service.Procedure;
import patterns.lesson5.service.Treatment;

public class TherapyDepartment extends Procedure implements Treatment {

    @Override
    public void treatment() {
        examinationDoctor();
        getTested();
        uziService();
        endTreatment();
    }

    @Override
    public void examinationDoctor() {
        System.out.println("Осмотр терапевта");
    }

    @Override
    public void getTested() {
        System.out.println("Сдать анализы: ОАК, Мочу, ЭКГ, АД");
    }
}
